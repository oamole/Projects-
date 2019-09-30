package subclass;
import superclass.Record;
public class Books extends Record {
   public Books()
   {
      super();
   }

   public Books(String title, String date, String author)
   {
      super(title, date, author);
   }

   public String toString()
   {
      return super.toString();
   }
}
