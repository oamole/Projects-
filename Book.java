package library.service.classes.library;
import library.service.classes.BookGenre;
import library.service.classes.BookRecord;
import java.io.*;
import java.util.Scanner;

public class Book {
   private static boolean duplicate(BookRecord details, BookRecord[] array)
   {
      for (BookRecord book: array)
      {
         if (book != null&& details.equals(book))
         {
            return true;
         }
      }
      return false;
   }

   public static BookRecord[] newArray(BookRecord[] newDetails, int resize)
   {
      BookRecord[] newArray = new BookRecord[newDetails.length + resize];
      for (int i = 0; i < newDetails.length; i++)
      {
         newArray[i] = newDetails[i];
      }
      newDetails = newArray;
      newArray   = null;

      return newDetails;
   }

   // public BookeGenre[] array(BookGenre[] bookArray){
   //     bookArray = new BookGenre[5 + bookCount];
   // }
   public static void main(String[] args)
   {
      int count        = 0;
      int resizeFactor = Integer.parseInt(args[1]);

      try{
         BookRecord[] bookDetails = new BookRecord[5];
         //read text file
         File    bookFile = new File("books.txt");
         Scanner scan     = new Scanner(bookFile);

         /* Read the tokens in each line and create an object of
          * type book record*/
         Scanner scnr = new Scanner(System.in);
         while (scan.hasNextLine())
         {
            String lineReader = scan.nextLine();
            // bookDetails = lineReader.split("\\n");
            String[] titleGenre  = lineReader.split(":");
            String[] authorArray = titleGenre[2].split(",");
            // String title = titleGenre[0];
            // String genrePos = titleGenre[1];
            BookRecord newBook = new BookRecord(titleGenre[0], BookGenre.valueOf(titleGenre[1]), authorArray);

            // Insert into client class if no duplicates exsists
            if (!duplicate(newBook, bookDetails))
            {
               if (count >= bookDetails.length)
               {
                  System.out.println("Resized the array from " + bookDetails.length +
                                     " to " + (bookDetails.length + resizeFactor));
                  BookRecord[] resizedRecords = new BookRecord[bookDetails.length + resizeFactor];
                  for (int i = 0; i < bookDetails.length; i++)
                  {
                     resizedRecords[i] = bookDetails[i];
                  }
                  bookDetails = resizedRecords;
               }
               bookDetails[count] = newBook;
               count++;
            }
            else
            {
               BookRecord[] resizedRecords = new BookRecord[bookDetails.length + resizeFactor];
            }
         }

         // for(int i = 0; i < bookDetails.length; i++){
         //     for (int j = i + 1; j < bookDetails.length; j++ ) {
         //         if (bookDetails[i] == bookDetails[j]) {
         //             // return true;
         //         }
         //         else{
         //             // return false;
         //         }
         //     }
         // }


         /* After insertion check if array is completely
          * filled and needs to be expanded*/

         while (true)
         {
            System.out.println("Select an option:");
            System.out.println("Type \"S\" to list books of a genre");
            System.out.println("Type \"P\" to print out all the book recors");
            System.out.println("Type \"Q\" to Quit");
            //get input from the user
            String option1 = scnr.next();
            switch (option1)
            {
            case "S":
               System.out.println("Type a genre. The genres are:");
               for (BookGenre d : BookGenre.values())
               {
                  System.out.println(d);
               }
               String option2 = scnr.nextLine();
               //assume the use will type in a valid genre
               //print out records of the selected genre
               for (int i = 0; i < count; i++)
               {
                  if (bookDetails[i].getGenre().equals(BookGenre.valueOf(option2)))
                  {
                     System.out.println("==================================");
                     System.out.println(bookDetails[i].toString());
                     System.out.println("==================================");
                  }
               }
               break;

            case "P": //list out all the records
               for (BookRecord allRecords : bookDetails)
               {
                  System.out.println("=======================");
                  if (allRecords != null)
                  {
                     System.out.println(allRecords.toString());
                  }
               }
               break;

            case "Q":
               System.out.println("Quitting program");
               System.exit(0);

            default:
               System.out.println("Wrong option! Try again");
               break;
            }
         }
      }
      catch (IOException ioe) {
         System.out.println("The file cannot be read.");
      }
   }
}
