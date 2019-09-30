package Client.Services.Classes;
import Client.Services.BillsType;
public class MyBills{
  private String Month;
  private BillsType Bills;
  private double [] Expenses;
  private int NumDays;
  private static int UniqueID = 0;
  private int ID;

  public MyBills(){
    Month="anymonth";
    Bills = null;
    Expenses= null;
    NumDays = 0;
    ID=+UniqueID++;
  }
  public MyBills(String NewMonth,BillsType expense,double [] newExpenses,int days){
    this.Month = NewMonth;
    this.Bills = expense;
    this.Expenses = newExpenses;
    this.NumDays = days;
    ID=+ UniqueID++;
  }
  public String getMonth(){
    return Month;
  }
  public BillsType getBills(){
    return Bills;
  }
  public double[] getExpenses(){
    return Expenses;
  }
  public int getNumDays(){
    return NumDays;
  }
  public void setMonth(String Month){
    this.Month = Month;
  }
  public void setBills(BillsType Bills){
    this.Bills = Bills;
  }
  public void setExpenses(double[] newExpenses){
    this.Expenses = new double [this.NumDays];
    for(int i=0;i<this.NumDays;i++){
      Expenses[i] = newExpenses[i];
    }
  }
  public void setNumDays(int NumDays){
    this.NumDays = NumDays;
  }
  public boolean equals(MyBills newBills){
    if((this.Bills == newBills.Bills)&&(this.NumDays == newBills.NumDays)){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){
    String myString = "";
    for(int j=0;j<this.Expenses.length;j++){
      myString += Expenses[j]+"";
      }
      String msg  = "This month is "+this.Month +"The amounts given are" +myString +"The days for the data are" +this.NumDays +"The ID is" +this.ID+"The static ID is"+this.UniqueID;
      return msg;
  }
}
