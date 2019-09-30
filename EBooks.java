package subclass;
import subclass.Books;
public class EBooks extends Books{
   private String URL;
   public EBooks()
   {
      super();
   }

   public EBooks(String title, String date, String author, String url)
   {
      super(title, date, author);
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
     str = str + "URL is  : " + this.getURL() + "\n";
     return str;
   }
}
