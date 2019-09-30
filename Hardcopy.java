package subclass;
import subclass.Books;
public class Hardcopy extends Books{
  private int Edition;
  public Hardcopy()
  {
     super();
  }

  public Hardcopy(String title, String date, String author,int edition_1)
  {
     super(title, date, author);
     this.Edition = edition_1;
  }
  public int getEdition()
  {
     return this.Edition;
  }

  public void setEdition(int edition_1)
  {
     this.Edition = edition_1;
  }
  public String toString()
  {
    String str = "";

    str = str + super.toString();
    str = str + "Edition is  : " + this.getEdition() + "\n";
    return str;
  }
}
