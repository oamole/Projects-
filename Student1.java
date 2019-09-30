public class Student1{
  private String FirstName;
  private String LastName;
  private int Age;
}
public Student1(){
  FirstName = "Kamal";
  LastName = "Brady";
  Age = 12;
}
public Student1(String newFirstName,String newLastName, int newAge){
  this.FirstName = newFirstName;
  this.LastName = newLastName;
  this.Age= newAge;
}
public String getLastName(){
  return this.LastName;
}
public String getFirstName(){
  return this.FirstName;
}
public int getAge(){
  return this.Age;
}
public void setLastName(String LastName){
  this.LastName = LastName;
}
public void setFIrstName(String FirstName){
  this.FirstName = FirstName;
}
public void setAge(int Age){
  this.Age = Age;
}
