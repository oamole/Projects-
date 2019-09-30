import java.util.*;
public class DateClient
{
  public static void main( String [] args )
  {
    Scanner input = new Scanner(System.in);
		String First_Name;
		String Last_Name;
		int YearOfBirth;
		Chinese_Zodiac value1 = new Chinese_Zodiac();
		System.out.println("Enter the First Name: ");
		System.out.println("Enter the Last Name: ");
		System.out.println("Enter the YearofBirth:");
		First_Name = input.next();
		Last_Name = input.next();
		YearOfBirth = input.nextInt();
		value1.setFirst_Name(First_Name);
		value1.setLast_Name(Last_Name);
		value1.setYearOfBirth(YearOfBirth);
		value1.animalYear();
		System.out.println(value1.toString()+ "\n");
	// Date xmas = new Date(12, 25, 2006 );
    // System.out.println( "Christmas Day this year is: " + xmas);

     // add code here to call your new "first day of the month" constructor
	 //Date firstDay = new Date (5,1,2006);
//System.out.println("The first day of the month is:  " +firstDay);	 
     // for New Year's day and output the date	 
//Date NewYear = new Date (1,1,2006);
//System.out.println("The New Year is:  "+NewYear);


     // add code here to create another Date object
//Date Birthday = new Date (04,21,2000);
//System.out.println("My Birthday is:  "+Birthday);
	 // for your birthdate	
	 


     // add code here to test your longDate() method 
	 
     // for each the three Date objects and output the results
//System.out.println("The days left after the New Year is:  " +NewYear.daysLeftInMonth());
//System.out.println("The days left after the Christmas is:  " + xmas.daysLeftInMonth());
	// System.out.println("The days left after my Birthday is:  " + Birthday.daysLeftInMonth());


  }
}

