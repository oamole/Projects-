class Person{
private String name;
private float []  grades;
Person(String new_name , float [] new_array){
	this.name = new_name;
	this.grades = new_array;
}
Person(){
	this.name = "john Doe";
	this.grades = new float[3];
	this.grades[0] = 3;
	this.grades[1] = 3;
	this.grades[2] = 3;
}
public String getName(){
	return this.name;
}
public float [] getGrades(){
	return this.grades;
}
public void setName(String new_name){
	this.name = new_name;
}
public void setGrades(float [] new_grades){
	this.grades = new float [new_grades.length];
	for(int i = 0; i<new_grades.length;++i){
		this.grades[i] = new_grades[i];
	}
}
public String toString(){
	String msg;
	msg = "Name:" +this.getName();
	for(int i=0; i<this.grades.length;++i){
		msg = msg+  "Grade:" + i + " " +this.grades[i] +"\n";
	}
	return msg;
}
}
