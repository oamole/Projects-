/*
	Author: John Korah
	Date: 07/11/18
*/
// Class Student stores Student details


class Student{ 
		private int id;
		private static int counter =1000;
		private String firstName;
		private String lastName;
		private float grade1; 
		private float grade2; 
		private float grade3; 
		public Student(String firstName, String lastName, float g1 , float g2, float g3){
			setfirstName(newfirstName);
			setlastName(newlastName);
			setGrade1(g1);
			setGrade2(g2);
			setGrade3(g3);
		}
		/*Task1: Write a member method calcAvg to calculate and return the average of the grades*/
		public float calcAvg(){
			float avg;//to input average 
			avg= (grade1+grade2+grade3)/3;//formula for calculating average 
			return avg;
		}
		public String getfirstName(){
			 return firstName;
		}
		public String getlastName(){
			return lastName;
		}
		public float getgrade1(){
			return grade1;
		}
		public float getgrade2(){
			return grade2;
		}
		public float getgrade3(){
			return grade3;
		}
		public void setfirstName(String newfirstName){
			  firstName= newfirstName;
		}
		public void setlastName(String newLastName){
		          lastName = newLastName;
		}
		public void setgrade1(float newgrade1){
			grade1= newgrade1;
		}
		public void setgrade2(float newgrade2){
			 grade2= newgrade2;
		}
		public void setgrade3(float newgrade3){
		        grade3= newgrade3;
		}
		
		/*Task5: Did you comment your code?*/
		
		/*Task6: Apply appropriate access modifiers to the member attributes.*/
		
		/*Task7: With the application of the access modifiers, do you need to add more member methods*/
		/*Task8: Lets add constructors*/

		
public Student(String name, String name1, double grade1, double grade2, double grade3){
	this.setid();
	this.setFirstName(f_name1);
	this.setLastName(l_name1);
	this.setgrade1(grade1);
	this.setgrade2(grade2);
	this.setgrade3(grade3);
	
}
public Student (){
	this.setid();
	this.setFirstName("Seun");
	this.setLastName("Amole");
	this.setgrade1(5);
	this.setgrade2(3);
	this.setgrade3(2);
	
	
	
	
	
		}
}