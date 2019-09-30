package bmi.client;//has to be first line
import java.io.File;
import java.util.Scanner;
class BMIApp {
	public static void main (String [] args){
		try{
		File fp = new File("list.txt");
		Scanner input = new Scanner(fp);
		int ht;
		int wt;
		BMI person;
		while(input.hasNext()){
		int wt = input.nextInt();
		int ht = input.nextInt();
		person = new BMI(wt,ht);
		System.out.println(person.toString());
		
		}
	
		}catch(Exception ex){
		}
	}
}
