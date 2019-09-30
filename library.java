package library.client.classes;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import library.service.classes.BookGenre;
import library.service.classes.BookRecord;
class library {
	BookRecord[] books; // array of objects
	int noRecords = 0; // no of records; it is not the size of the array

	public void resize(int resizeFactor) {// library to expand the array
		// initialize a new array with larger size and then copy the variables to
		int initSize = this.noRecords;
		BookRecord[] newArray = new BookRecord[initSize + resizeFactor];
		// copy the object over
		for (int i = 0; i < this.books.length; ++i) {
			newArray[i] = this.books[i];
		}
		this.books = newArray;
		System.out.println("Resized the array from " + initSize + " to " + this.books.length);

	}

	public void searchByGenre(BookGenre genre) {
		// loop through the book records and list the genre
		BookRecord [] array = new BookRecord[this.noRecords];
		int counter = 0;
		for (int i = 0; i < this.noRecords; ++i) {
			if (this.books[i].getGenre() == genre) {
				//System.out.println(books[i].toString());
				array[counter] = books[i];
				counter++;
				//System.out.println(array[i].toString());
			}
		}
		BookRecord [] flips = sortPages(array, counter);
		for(int g=0;g<flips.length;g++) {
			System.out.println(flips[g]);
		}
	}

	public BookRecord[] sortPages(BookRecord[] myArray, int noRecords) {
		BookRecord [] array = new BookRecord[noRecords];
		BookRecord temp;
		int ArrayLength;
		int index = 0;
		for(int i=0;i<array.length;i++) {
			array[i] = myArray[i];
		}
		for(int j=0;j<array.length;j++) {
			ArrayLength = (array.length)-j;
			index = 0;
			for(int k=0;k<ArrayLength;k++) {
				if(array[k].getPages() > array[index].getPages()) {
					index = k;
				}
			}
			temp = array[index];
			array[index] = array[ArrayLength-1];
			array[ArrayLength-1] = temp;
		}
		return array;
	}

	public BookRecord [] sortString(BookRecord [] myArray, int noRecords) {
		BookRecord [] array = new BookRecord[noRecords];
		BookRecord temp;
		int ArrayLength;
		int index = 0;
		for(int i=0;i<array.length;i++) {
			array[i] = myArray[i];
		}
		for(int j=0;j<array.length;j++) {
			ArrayLength = (array.length)-j;
			index = 0;
			for(int k=0;k<ArrayLength;k++) {
				if(array[k].getTag().compareTo(array[index].getTag())>0) {
					index = k;
				}
			}
			temp = array[index];
			array[index] = array[ArrayLength-1];
			array[ArrayLength-1] = temp;
		}
		return array;
	}


	public void searchTag(String tag) {
		for (int i = 0; i < this.noRecords; ++i) {
			if (this.books[i].getTag().equals(tag)) {
				System.out.println(this.books[i].toString());
			}
		}
	}

	public boolean searchForDuplicate(BookRecord aRecord) {
		// loop through the library and find duplicates
		// return true if duplicate found
		// else return false
		if (this.noRecords == 0)
			return false;
		for (int i = 0; i < this.noRecords; ++i) {
			if (this.books[i].equals(aRecord))
				return true;
		}
		return false;
	}

	public void print(BookRecord[] theArray, int noRecords) {// list the library
		BookRecord [] aarray = sortString(theArray, noRecords);
		for(int g=0;g<aarray.length;g++) {
			System.out.println(aarray[g]);
		}
		/*for (int i = 0; i < this.noRecords; ++i) {
			System.out.println(this.books[i].toString());
		}*/
	}

	library() {
		this.books = new BookRecord[5];// intial size is 5
	}



	public static void main(String[] args) {// instantiate the library
		// arg[0]: text file //arg[1]: resize factor
		int resizeFactor = Integer.parseInt(args[1]);
		library myLib = new library();
		// read the the files from text files
		String[] authors;
		BookRecord aRecord;
		Scanner scan;
		String str;
		try {
			File myFile = new File(args[0]);
			scan = new Scanner(myFile);// each line has the format
										// title:genre:author-name-1,author-name-2..authorname-m
			while (scan.hasNextLine()) {
				str = scan.nextLine();
				String[] tok = str.split(":");
				authors = tok[2].split(",");
				int page = Integer.parseInt(tok[4]);
				aRecord = new BookRecord(tok[0], tok[1], authors, tok[3], page);

				// check for duplicate records
				if (!myLib.searchForDuplicate(aRecord)) {
					// create a BookRecord object and load it on the array
					myLib.books[myLib.noRecords] = aRecord;
					myLib.noRecords++;
					// System.out.println("No of records: " + myLib.noRecords);
				} else {
					System.out.println("Found a duplicate");
					System.out.println(aRecord.toString());
				}
				// check if the array needs to resize
				if (myLib.books.length == myLib.noRecords) { // need to add additional space
					myLib.resize(resizeFactor);
				}
			}
			scan.close();
		} catch (IOException ioe) {
			System.out.println("Error!! The file can not be read");
		}


				// User interactive part
		String option1, option2, option3;
		scan = new Scanner(System.in);
		while (true) {
			System.out.println("Select an option:");
			System.out.println("Type \"S\" to list books of a genre");
			System.out.println("Type \"P\" to print out all the book records");
			System.out.println("Type \"T\" to search by tags");
			System.out.println("Type \"Q\" to Quit");
			option1 = scan.nextLine();

			switch (option1) {
			case "S":
				System.out.println("Type a genre. The genres are:");
				for (BookGenre d : BookGenre.values()) {
					System.out.println(d);
				}
				option2 = scan.nextLine(); // assume the use will type in a valid genre
				myLib.searchByGenre(BookGenre.valueOf(option2));
				break;

			case "P":
				myLib.print(myLib.books,myLib.noRecords);
				break;

			case "Q":
				System.out.println("Quitting program");
				System.exit(0);

			case "T":
				System.out.println("Type in the tag needed");
				option3 = scan.nextLine();
				boolean result = false;
				for (int i = 0; i < myLib.noRecords; i++) {
					if (myLib.books[i].getTag().equals(option3)) {
						System.out.println(myLib.books[i].toString());
						result = true;
					}
				}
				if(result == false) {
					System.out.println("no match found");
				}
				break;

			default:
				System.out.println("Wrong option! Try again");
				break;

			}

		}

	}

}
