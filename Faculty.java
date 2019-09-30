/*
	Author: John Korah
	Date: 07/11/18
*/


class Faculty{ 
		String firstName;
		String lastName;
		float grossSalary; 
		int workHours; 
		double taxRate;
		/*Task1: Write a member method calcNetSalary to calculate net salary*/
		public float calcNetSalary(){
			float netSalary;
			netSalary= (1-(float)taxRate)*grossSalary;
			return netSalary;
		}
		public String getfirstName(){
			 return firstName;
		}
		public String getlastName(){
			return lastName;
		}
		public float getgrossSalary(){
			return grossSalary;
		}
		public int getworkHours(){
			return workHours;
		}
		public double gettaxRate(){
			return taxRate;
		}
		
		public void setfirstName(String newfirstName){
			  firstName= newfirstName;
		}
		public void setlastName(String newLastName){
		          lastName = newLastName;
		}
		public void setgrossSalary(float newgrossSalary){
			grossSalary= newgrossSalary;
		}
		public void setworkHours(int newworkHours){
			 workHours= newworkHours;
		}
		public void settaxRate(double newtaxRate){
		        taxRate= newtaxRate;
		}
		public static void main(String args[]){
		/*Task2: Create an object of Class faculty called faculty1*/
		Faculty faculty1 = new Faculty () ;
		/*Task3: Assign some values for its instance variables*/
		faculty1.firstName= "John";
		faculty1.lastName="Korah" ;
		faculty1.grossSalary=90000;
		faculty1.workHours=89000;//hours per week 
		faculty1.taxRate=0.05;
		/*Task4: Now call the  method calcNetSalary to calculate and return Net Salary*/
		float net;
		net=faculty1.calcNetSalary();
		System.out.println("Net Salary:" +net);
		
		/*Task5: Did you comment your code?*/
		public Faculty (){

}	
public Faculty(String f_name, String l_name, float g_salary, int w_hours, double t_rate){
	this.setFirstName("John");
	this.setLastName("Doe");
	this.setGrossSalary(0);
	this.setWorkHours(0);
	this.setTaxRate(0.05);
}
public Faculty(String f_name, String l_name, float g_salary, int w_hours, double t_rate){
	this.setFirstName(f_name);
	this.setLastName(l_name);
	this.setGrossSalary(0);
	this.setWorkHours(0);
	this.setTaxRate(0.05);
}
		/*Task6: Apply appropriate access modifiers to the member attributes.*/
		/*Task7: With the application of the access modifiers, do you need to add more member methods*/
		/*Task8: Lets add constructors*/
		/*Task9: Come up with a way to provide a unique ID*/
		public void setFirstName(String tmp_first_name_)
		
	    
		
		}
}