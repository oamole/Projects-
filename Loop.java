import java.util.Scanner;
import java.io.File;
class Loop{
	public static void main (String [] args){
		int sum = 0;
		int count = 0;
		try{
			File fname = new File("date.txt");
			Scanner input = new Scanner(fname);
			while (count<6){
				sum = sum + input.nextInt();
				count = count +1;
			}
			System.out.println("Sum=" +sum);
		} catch(Exception ex){
			