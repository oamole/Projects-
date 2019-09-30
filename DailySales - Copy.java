public class DailySales{
  private int TotalDays;
  int [] SalesData;


public DailySales(){
  TotalDays = 10;
  SalesData = null;

}
  public DailySales(int newTotalDays){
    this.TotalDays = newTotalDays;
    SalesData = new int [TotalDays];
  }
  public boolean addSales(int DayNumber,int Sales ){
    if(DayNumber>0){
    SalesData [DayNumber-1] = Sales + SalesData[DayNumber-1];
    return true;
  }
    else{
      return false;
    }
  }
    public int MaxDay(int[] SalesData){
  int maxValue =  SalesData[0];
  for(int i=0;i < SalesData.length;i++){
    if(SalesData[i] > maxValue){
      maxValue = SalesData[i];
    }
  }
  return maxValue;
}
public int [] daysBelowGoal(){
  int Goal = 100;
 int j = 0;
  for(int i=0;i < SalesData.length;i++){
    if(SalesData[i]<100){
      j++;
    }
  }
  int [] DaysBelowGoal = new int [j];
  int g = 0;
  for(int i=0;i < SalesData.length;i++){
    if(SalesData[i]<100){
   DaysBelowGoal [g] = i;
   g++;
    }


}
return DaysBelowGoal;
  }
  public String toString(){
    String msg;
    msg = "Days and Sales" +SalesData +"The days below Goal are:" +daysBelowGoal();
    return msg;
  }
}
