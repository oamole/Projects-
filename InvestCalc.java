public class InvestCalc
{
	private double InterestRate;
	private double Principal;
	private int NumberofYears;
	private double FutureValue;
	
	public static final int SHORT_TERM = 5;
	public static final int MIDDLE_TERM = 10;
	public static final int LONG_TERM = 20;
	
	public InvestCalc(){
          InterestRate= 0.00;
		  Principal=0.00;
	} 
	public InvestCalc(double tmp_InterestRate, double tmp_Principal){
		setInterestRate(tmp_InterestRate);
		setPrincipal(tmp_Principal);
	}
	
		double getInterestRate(){
			return InterestRate;
		}
		double getPrincipal(){
			return Principal;
		}
		int getNumberofYears(){
			return NumberofYears;
		}
		double getFutureValue(){
			return FutureValue;
		}
		public void setInterestRate(double InterestRate){
			this.InterestRate=InterestRate;
		}
		public void setPrincipal(double Principal){
			this.Principal= Principal;
		}
		public void setNumberofYears(int NumberofYears){
			this.NumberofYears= NumberofYears;
		}
		public void setFutureValue(double FutureValue){
			this.FutureValue=FutureValue;
		}
		public String toString(){
	String msg = "InterestRate: " +InterestRate   +  "   Principal: " +Principal  + " NumberofYears : " +NumberofYears  + " FutureValue: " +FutureValue ;
    return msg;
}
        public double FutureValue(){
			double FutureValue;
			FutureValue = Principal*Math.pow(1+InterestRate,NumberofYears);
			return FutureValue;
		}
		
	
	public void displayTable(){
		System.out.println("YEAR"         + "\t"     +       "INTEREST RATE"   +               "\t"    +       "PRINCIPAL"    +   "\t"    +     "FUTURE VALUE");
		System.out.println( (SHORT_TERM)            + "\t"     +   InterestRate     +                 "%\t\t$"               +         Principal     +                                      "\t\t$"        + Principal*Math.pow(1+InterestRate,5));
		System.out.println( (MIDDLE_TERM)          + "\t"      +       InterestRate     +                 "%\t\t$"    +           Principal     +   "\t\t$"    +      Principal*Math.pow(1+InterestRate,10));
		System.out.println(  (LONG_TERM)            + "\t"     +     InterestRate     +                "%\t\t$"    +          Principal     +   "\t\t$"    +      Principal*Math.pow(1+InterestRate,20));
	}
}	