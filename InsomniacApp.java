import java.util.*;
class InsomniacApp{
	public static void main(String [] args){
		//get the input from user
		Scanner input = new Scanner(System.in);
        System.out.print( "Enter name (lastname,firstname [no spaces]): " );
        String Name = input.next();
        System.out.print( "Enter duration1 (in hrs): " );
        int Duration_1 = input.nextInt();
		
		
		
		/* Add your code*/
		Insomniac value1 = new Insomniac();
		System.out.println("Insomniac Object");
		System.out.println(value1.toString()+ "\n");
			
		value1.setDuration_1(Duration_1);
		value1.setName(Name);
		System.out.println("New Insomniac Object");
		System.out.println(value1.toString()+ "\n");
		value1.convertToDays();
		value1.remainderHrs();
		
	}	
}