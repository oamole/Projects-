import java.util.*;
public class SwitchEx{
	public static void main (String [] args){
	Scanner input = new Scanner (System.in);
	System.out.println("Enter the year:");
	String yr = input.next();//gets input from user
	if(yr.length() ==2){
	int yrInt = Integer.parseInt(yr);
	yrInt = yrInt + 2000;
	System.out.println("Yr is: " +yrInt);
	}else if(yr.length() ==4){
	int yrInt = Integer.parseInt(yr);
	System.out.println("Year is:" + yrInt);
	}
	else{
		System.out.println("Invalid Year");
	}
	}
}

	