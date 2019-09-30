package subclass;
import subclass.Magazines;
public class Emagazine extends Magazines {
   private String URL;
   public Emagazine()
   {
      super();
   }

   public Emagazine(String title, String date, String edit, int issue_no, int volume_no,String url)
   {
      super(title, date,edit, issue_no, volume_no);
      this.URL = url;
   }

   public String getURL()
   {
      return this.URL;
   }

   public void setURL(String url)
   {
      this.URL = url;
   }

   public String toString()
   {
     String str = "";
     str = str + super.toString();
      str = str + "URL : " + this.getURL() + "\n";
     return str;

   }
}
