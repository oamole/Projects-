import java.util.*;
class Iter{
public static void main (String [] args){
  int InitialValue;
  int UpperLimit;
  int Increment;
  int OutputPerLine;
  int counter =0;

  Scanner input = new Scanner(System.in);
  System.out.print("Enter the InitialValue: ");
  InitialValue = input.nextInt();
  System.out.print("Enter the UpperLimit: ");
  UpperLimit =  input.nextInt();
  System.out.print("Enter the Increment: ");
  Increment = input.nextInt();
  System.out.print("Enter the OutputPerLine: ");
  OutputPerLine = input.nextInt();
  for(int i = InitialValue; i<=UpperLimit; i+=Increment){
     if(counter<OutputPerLine){
      System.out.print(i+" " );
      counter +=1;
     }
     else{
      System.out.println();
      System.out.print(i+" ");
      counter = 1;
      }
  }

}
}
