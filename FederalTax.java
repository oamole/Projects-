import java.text.*;
public class FederalTax{
	private double TaxableIncome;
	private double TaxPaid;
	public static NumberFormat form = NumberFormat.getCurrencyInstance();
	public static final int BRACKET_1 = 22100;
	public static final int BRACKET_2 = 53500;
	public static final int BRACKET_3 = 115000;
	public static final int BRACKET_4 = 250000;
	public static final int BASETAX_BRACKET_1 = 3315;
	public static final int BASETAX_BRACKET_2 = 3315;
	public static final int BASETAX_BRACKET_3 = 12107;
	public static final int BASETAX_BRACKET_4 = 31172;
	public static final int BASETAX_BRACKET_5 = 79772;
	public static final double TAXPERCENTAGE_BRACKET_1 = 0.15;
    public static final double TAXPERCENTAGE_BRACKET_2 = 0.28;
    public static final double TAXPERCENTAGE_BRACKET_3 = 0.31;
    public static final double TAXPERCENTAGE_BRACKET_4 = 0.36;
    public static final double TAXPERCENTAGE_BRACKET_5 = 0.396;	
	
	public FederalTax(){
		TaxableIncome = 0;
	}
	public FederalTax(double NewTaxableIncome){
		TaxableIncome = NewTaxableIncome;
	}
	double getTaxableIncome(){
		return TaxableIncome;
	}
	double getTaxPaid(){
		return TaxPaid;
	}
	public void setTaxableIncome(double TaxableIncome){
			if (TaxableIncome>=0){
				this.TaxableIncome = TaxableIncome;
			}
			else 
			{
System.out.println("Restart the input");
		TaxableIncome = 0;
			}
	
	}
public void setTaxPaid(double TaxPaid){
	this.TaxPaid = TaxPaid;
}
		
	public double taxPaid(){
		
		if(TaxableIncome <= 22100){
		 TaxPaid =  TAXPERCENTAGE_BRACKET_1 * TaxableIncome; 
		 return TaxPaid;

	}
	if(TaxableIncome >= 22100 && TaxableIncome <= 53500){
		  TaxPaid =  BASETAX_BRACKET_2 + (TAXPERCENTAGE_BRACKET_2 * (TaxableIncome-BRACKET_1));
		  return TaxPaid;

		}
		
	if(TaxableIncome >= 53500 && TaxableIncome <= 115000 ){
		  TaxPaid =  BASETAX_BRACKET_3 + (TAXPERCENTAGE_BRACKET_3 * (TaxableIncome-BRACKET_2));
		  return TaxPaid;
		}
		
	if(TaxableIncome >= 115000 && TaxableIncome <= 250000 ){
		   TaxPaid =  BASETAX_BRACKET_4 + (TAXPERCENTAGE_BRACKET_4 * (TaxableIncome-BRACKET_3));
		   return TaxPaid;
		 
		 }
	
	
	if(TaxableIncome > 250000){
		  TaxPaid =  BASETAX_BRACKET_5 + (TAXPERCENTAGE_BRACKET_5 * (TaxableIncome-BRACKET_4));
		  return TaxPaid;
		}	
	else
	{
		System.out.println("Input an actual value");
		return 0;
	}
}
public String toString(){
	String msg ="TaxableIncome is:"    + FederalTax.form.format(TaxableIncome)    + "\t"     +"TaxPaid is:"    +form.format(TaxPaid)   + "\t";
     return msg;
}	 
}