import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class CountThreshold{
  private String filename;
  private double threshold;

  public CountThreshold(String newfilename, double newthreshold){
    filename = newfilename;
    threshold = newthreshold;
    }
    String getfilename(){
      return filename;
    }
    double threshold(){
      return threshold;
    }
    public void setfilename(String filename){
      this.filename = filename;
    }
    public void setthreshold(double threshold){
      this.threshold = threshold;
    }
  public int  getCount(){
    Scanner scan;
    Double line;
    int count = 0;
    try{
      scan = new Scanner(new File(filename));
      while(scan.hasNextLine()){
        line =Double.parseDouble(scan.nextLine());
        if(threshold<line){
          count =count+1;
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
    msg = "Filename is:"  +"\t"  +filename +    "\t"  +   "Threshold is:"   +threshold;
    return msg;
  }
}
