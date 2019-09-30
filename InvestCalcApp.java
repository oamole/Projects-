import java.util.*;
import java.text.*;

public class InvestCalcApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare Scanner class and interest, principal vars
		Scanner input = new Scanner(System.in);		
		double InterestRate, Principal;		//vars for the interest rate and initial investment
		final NumberFormat DOLLAR_FORMAT = NumberFormat.getCurrencyInstance();

		//instantiate a default object of the InvestCalc class
		InvestCalc value1 = new InvestCalc();
		System.out.println("Default InvestCalc Object");
		System.out.println(value1.toString()+ "\n");
		
		//query for interest and principal
		System.out.print("Enter an interest rate in decimal format: ");
		InterestRate = input.nextDouble();
		System.out.print("Enter the initial investment value: ");
		Principal = input.nextDouble();
		

		//change object and output
		value1.setInterestRate(InterestRate);
		value1.setPrincipal(Principal);
		System.out.println("Updated InvestCalc Object");
		System.out.println(value1.toString()+ "\n");
		
		//test the futureValue and displayTable methods
// UNCOMMENT THE NEXT TWO STATEMENTS WHEN YOU ARE READY TO TEST
		System.out.println("Value after 1 year " + DOLLAR_FORMAT.format(Principal*Math.pow(1+InterestRate,1)) + "\n");	
		value1.displayTable();	
		
		//query for another interest and principal
		System.out.print("Enter another interest rate in decimal format: ");
		InterestRate = input.nextDouble();
		System.out.print("Enter another initial investment value: ");
		Principal = input.nextDouble();
		
		//instantiate an object of the InvestCalc class
		InvestCalc value2 = new InvestCalc(InterestRate, Principal);
		System.out.println("Non-Default InvestCalc Object");
		System.out.println(value2.toString()+ "\n");

// UNCOMMENT THE NEXT STATEMENT WHEN YOU ARE READY TO TEST
		value2.displayTable();
	}
}

