import java.util.*;
import java.io.*;
public class FindDuplicates{
private String filename;

pub FindDuplicates(String newfilename){
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
  String line;

  String [] tokens;
  int count = 0;
try{
  scan = new Scanner(new File(filename));
  while(scan.hasNextLine()){
    scan.nextLine();
    lineInFile = lineInFile+1;
  }
}
  catch(Exception ex){
    System.out.println();
  }



  double [] list;
  list = new double[lineInFile];

  try{
    scan = new Scanner(new File(filename));
    while(scan.hasNextLine()){
      line = scan.nextLine();
      tokens = line.split(" ");
      Boolean found = false;
      for(int i =0; i < tokens.length; i++){
        if(line.split(" ")[0].equals(tokens[0])){
          found = true;
        }
      }

        if(!found){
        list[emptySlot] = Double.parseDouble(line);
          emptySlot +=1;
        }
      }
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
}
