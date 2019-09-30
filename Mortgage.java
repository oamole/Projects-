import java.util.*;
class Mortgage{

public static void main(String args[]){
double income;
income = 6000; 
double debt;
debt = 500;
double UpperLimit;
double LowerLimit;
UpperLimit = (0.42*income)- debt;                          //formula for upper and lower limit
LowerLimit = (0.36*income)- debt;

double someVar; //declare a var for double input from keyboard
Scanner input = new Scanner(System.in);//declares an instance of Scanner class
income = input.nextDouble();//assigns next double read from keyboard to someVar
debt = input.nextDouble();
System.out.println("Income=" +income);
System.out.println("Debt=" +debt);
System.out.println("UpperLimit=" +UpperLimit);
System.out.println("LowerLimit=" +LowerLimit);

}
} 