import java.util.*;
import java.io.*;
public class FindDuplicates{
private String filename;

FindDuplicates(String newfilename){
  filename = newfilename;
}

String getfilename(){
  return filename;
}

public void setfilename(String filename){
  this.filename = filename;
}

public double getDuplicates(){
  int lineInFile = 0;
  int emptySlot =0;
  Scanner scan;
  Scanner scan1;
  String line;

  String [] tokens;
  int count = 0;
try{
  scan = new Scanner(new File(filename));
  while(scan.hasNextLine()){
    scan.nextLine();
    lineInFile = lineInFile+1;
  }
  scan.close();
}
  catch(Exception ex){
    System.out.println();
  }



  double [] list;
  list = new double[lineInFile];

  try{
    scan1 = new Scanner(new File(filename));
    while(scan1.hasNextLine()){
      Boolean found = false;
       line = scan1.nextLine();
      tokens = line.split(" ");
      for(int i =0; i < tokens.length; i++){
        if(line.split(" ")[0].equals(tokens[0])){
          found = true;
        }
      }

        if(!found){
        list[emptySlot] = line;
          emptySlot +=1;
        }
      }
      scan1.close();
    }
  catch(Exception ex){
    System.out.println("File not found");
  }
  return count;
}

public String toString(){
  String msg;
  msg = "Filename is:"  +"\t"  +filename +    "\t" ;
  return msg;
}
