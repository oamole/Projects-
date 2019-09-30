package bmi.service;
public class BMI {//BMI class
/*Attributes*/
	private int id;
	private int weight, height;
	public static int counter=1000; // to provide unique ids
	private static final int DEFAULT_WEIGHT=175, DEFAULT_HEIGHT=72; //constants
/*Constructors*/
	public BMI() { 
		setId();
		setWeight(DEFAULT_WEIGHT); 
		setHeight(DEFAULT_HEIGHT); 
	}
	
	public BMI(int newWeight, int newHeight) { 
		setId();
		setWeight(newWeight); 
		setHeight(newHeight);
	}
/*accessors*/
	public int getId(){
		return this.id;
	}
	public int getWeight() { 
		return this.weight; 
	}
	public int getHeight() { 
		return this.height; 
	}
	public double getBMI() { 
		return 703.*this.weight/this.height/this.height; 
	}

/*Mutators**/
	public void setId(){
		this.id=BMI.counter;
		BMI.counter=BMI.counter+1;
	}
	public void setWeight(int newWeight) {
		if (newWeight>0){
			this.weight=newWeight;
		}
		else{
			this.weight=DEFAULT_WEIGHT;
		}
	}
	public void setHeight(int newHeight) {
		if (newHeight>0){
			this.height=newHeight;
		}
		else{ 
			this.height=DEFAULT_HEIGHT;
		}
	}
/*Other Methods*/
	public String getStatus() {//Provide status of the 
		double bmi=getBMI(); 
		String temp;
		if (bmi<18.5){
			temp="Underweight";
		}
		else if (bmi<25) {
			temp="Normal";
		}
		else if (bmi<30) {
			temp="Overweight";
		}
		else { 
			temp="Obese";
		}
		return temp;
	}
	public String toString() {
		return "ID=" + this.id + " Weight=" + this.weight+" Height=" + this.height + " BMI="+ this.getBMI()+" "+this.getStatus();
	}
	public boolean equals(BMI data) {
		if (weight==data.getWeight() && height==data.getHeight()){
			return true;
		}
		else { 
			return false;
		}
	}
}
