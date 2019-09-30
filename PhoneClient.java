package main;
import serviceB.BusinessPhone;
import service.Phone;
import java.util.Scanner;
public class PhoneClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter area code");
		String area = scan.nextLine();
		System.out.println("Enter exchange");
		String exchange = scan1.nextLine();
		System.out.println("Enter numbers");
		String numbers = scan2.nextLine();

		System.out.println("Enter extension (If it's not a business phone just press enter)");
		String extension = scan3.nextLine();


		// create a Phone
		Phone phone1 = new Phone("355", "856", "5439");
		System.out.println("phone1:"+phone1.toString()+"\n");

		// create a BusinessPhone
		BusinessPhone businessPhone1 = new BusinessPhone("312", "987", "3340", "5168");
		System.out.println("businessPhone1:"+businessPhone1.toString()+"\n");


		// create a BusinessPhone from a Phone
		BusinessPhone businessPhone2 = new BusinessPhone(phone1, "3456");
		System.out.println("businessPhone2:"+businessPhone2.toString()+"\n");

		// change the Phone
		phone1.setAreaCode("234");
		System.out.println("phone1:"+phone1.toString()+"\n");


		// output the BusinessPhone created from the Phone
		System.out.println("businessPhone2:"+businessPhone2.toString()+"\n");

		// call Phone method on a BusinessPhone
		System.out.println("businessPhone1 exchange:" + businessPhone1.getExchange()+"\n");

		// try to create a bad phone number
		Phone phone2 = new Phone("4647", "67", "90009");
		//System.out.println("phone2:"+phone2.toString()+"\n");

		// call a BusinessPhone method on a Phone
		//This should not work. why?
		//String temp = phone1.getExtension();
		//This does work because there is no element extension as extension in Phone class, extension in its subclass Business Phone
		//The user input from keyboard
				Phone phone3 = new Phone(area, exchange, numbers);
				System.out.println("phone3:"+phone3.toString()+"\n");



				phone3.setAreaCode("312");
				System.out.println("phone3:"+phone3.toString()+"\n");
	}
}
