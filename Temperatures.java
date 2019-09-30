import java.util.*;
import java.io.*;
public class Temperatures{
  public static void main (String [] args){
	Scanner input = new Scanner(System.in);
  int DaysOfTemperature;
  double HighTemperature;
double [] Numbers;
System.out.println("How many days worth of high temperatures do you have to enter?  ");
  DaysOfTemperature = input.nextInt();
    Numbers = new double[DaysOfTemperature];
  for(int i =0; i<DaysOfTemperature; i++){
    System.out.println("Enter high temperature for day # "  + (i+1) + ":" );
HighTemperature = input.nextDouble();
        if(DaysOfTemperature>=0){
          System.out.println( "You may continue:" );
          Numbers[i] = HighTemperature;

        }
      else{
        System.out.println("Enter a positive number:");
      }

  }
double j = getMinValue(Numbers) - getMaxValue(Numbers);
System.out.println("The maximum temperature change is "+j +"between days" +getMinValue(Numbers) +"and" +getMaxValue(Numbers));
}

public static double getMaxValue(double[] Numbers){
  double maxValue =  Numbers[0];
  for(int i=0;i < Numbers.length;i++){
    if(Numbers[i] > maxValue){
      maxValue = Numbers[i];
    }
  }
  return maxValue;
}
public static double getMinValue(double[] Numbers){
  double minValue = Numbers[0];
  for(int i=0;i<Numbers.length;i++){
    if(Numbers[i] < minValue){
      minValue = Numbers[i];
     }
  }
    return minValue;
 }

}
