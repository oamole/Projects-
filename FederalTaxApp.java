import java.util.*;
import java.text.*;
class FederalTaxApp{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double TaxableIncome;
		FederalTax value1 = new FederalTax();
		System.out.println("Default FederalTax Object");
		System.out.println(value1.toString()+ "\n");
		System.out.print("Enter the Taxable Income: ");
		TaxableIncome = input.nextDouble();
		value1.setTaxableIncome(TaxableIncome);
		value1.taxPaid();
		System.out.println("Updated InvestCalc Object");
		System.out.println(value1.toString()+ "\n");
     
	}
}
