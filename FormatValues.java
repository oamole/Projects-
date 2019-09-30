/* 
FormatValues: format numeric values
*/
import java.text.NumberFormat;
class FormatValues
{     
   public static void main(String args[])
   {
	  double amt = 10.56;
      NumberFormat form=NumberFormat.getCurrencyInstance();
	  System.out.println(form.format(amt));
   }
}






