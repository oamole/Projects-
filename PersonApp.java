import java.util.*;
import java.text.DecimalFormat;
import java.io.File;

class PersonApp{
//  public static void genGrades(float [] gradeArr){
//DecimalFormat df = new DecimalFormat("#.00");
  //  Random rnd = new Random();
    //int min = 0;
  //  int max = 4;
//for (int i =0; i<gradeArr.length;++i){
  //gradeArr[i]=Float.valueOf(df.format( rnd.nextFloat()*(max-min)));
//}
  //}
  public static Person[] reSize(Person[] oldArr,int new_size){
    //resize the array to a new size
    Person [] newArr = new Person [3];
    for(int i=0;i<oldArr.length;++i){//copy value of old array
      newArr[i]= oldArr[i];
    }
    return newArr;
  }
public static void main (String [] args){
/*
Person p1 = new Person();
System.out.println(p1.toString());
float [] grades = new float[5];
genGrades(grades);

Person p2 = new Person("John Snow" , grades);
grades = new float[6];
System.out.println(p2.toString());
genGrades(grades);




//grades[0] = 2.3f;
//grades[1] = 3.3f;
//grades[2] = 1.3f;
//grades[3] = 3.5f;
//grades[4] = 4.0f;

 Person p3 = new Person("Missandei" , grades);
 System.out.println(p3.toString());
grades = new float[5];
 genGrades(grades);

//create an array of type Person
Person [] arr = new Person[3];
arr[0]= new Person();
arr[1] = p2;
arr[2] = p3;
 //grades[0] = 2.3f;
//grades[1] = 3.3f;
//grades[2] = 1.3f;
//grades[3] = 3.5f;
//grades[4] = 4.0f;
for (int i = 0; i<arr.length; ++i){
  System.out.println(arr[i].toString());
}
*/
//read persons details from the text file
try{
File fp = new File("data.txt");
Scanner input = new Scanner(fp);
String line;
String [] tokens;
int count=0;
Person [] pArr = new Person [2];
while(input.hasNext()){
  line = input.nextLine();
  tokens = line.split(":");
  for(int i=0;i<tokens.length;++i){
    System.out.println(tokens[i]);
  }
  float [] arr = new float[tokens.length-1];
  for(int i=0;i<arr.length;++i){
    arr[i]=Float.parseFloat(tokens[i+1]);
    catch(Exception ex){
      System.out.println("File not found");
      ex.printStackTrace();
  }
  Person p = new Person(tokens[0],arr);
  pArr[count] = p;
  ++count;

for(int i=0; i<pArr.length;++i){
  System.out.println(pArr[i].toString());
}
for(Person p: pArr){
  System.out.println(p.toString());
}//resize array of objects to a larger size
}pArr = reSize(pArr,10);
for(Person p: pArr){
  if(p !=null){
  System.out.println(p.toString());
}
else{
  System.out.println("Null Object");
}
ArrayList<Person> pArr1 = new ArrayList<Person>();//declare and instantiate ArrayList
for(int i=0;i<pArr.length;++i){
  if(pArr[i] != null){
    pArr1.add(pArr[i]);
  }
}
System.out.println("Printing out the Array List");
for(int i=0; i<pArr1.size();++1){
  Person p = pArr1.get(i);
  System.out.println(p.toString());
}

}
}
}
}
}
