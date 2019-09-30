package subclass;
import subclass.Magazines;
public class MagHardCopy extends Magazines {
   private String Edition;
   public MagHardCopy()
   {
      super();
   }

   public MagHardCopy(String title, String date, String author, int issue_no, int volume_no,String edit, String edition)
   {
      super(title, date, author, issue_no, volume_no,edit);
      this.Edition = edition;
   }

   public String getEdition()
   {
      return this.Edition;
   }

   public void setEdition(String edition)
   {
      this.Edition = edition;
   }

   public String toString()
   {
     String str = "";
     str = str + super.toString();
      str = str + "Edition : " + this.getEdition() + "\n";
     return str;
   }
}
