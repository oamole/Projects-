package subclass;
import superclass.Record;

public class Newspapers extends Record{
  private String Edition;
  public Newspapers(){
    super();
  }
  public Newspapers(String title, String date, String author,String edition)
  {
     super(title, date,author);
     this.Edition = edition;
  }
  public String getEdition()
  {
     return this.Edition;
  }
  public void setEdition(String edition){
    this.Edition = edition;
  }
  public String toString()
  {
     String str = "";

     str = str + super.toString();
     str = str + "Edition is  : " + this.getEdition() + "\n";
     return str;
  }

  }
