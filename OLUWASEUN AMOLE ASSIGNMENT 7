import java.util.Scanner;
import java.util.Vector;

public class Recursion {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      String  input = scan.nextLine();

      Vector<String> ans = printPossibilities(input);
      System.out.println(ans);
   }

   public static Vector<String> printPossibilities(String number)
   {
      Vector<String> sol = new Vector<String>();
      recursiveALG(sol, "", number);
      return sol;
   }

   private static void recursiveALG(Vector<String> sol, String mnemonicSoFar, String remaining)
   {
      if (remaining.length() == 0)
      {
         sol.add(mnemonicSoFar);
      }
      else
      {
         int    numLetters = digitLetters(remaining.charAt(0)).length();
         String letters    = digitLetters(remaining.charAt(0));
         if (remaining.length() > 1)
         {
            remaining = remaining.substring(1);
         }
         else
         {
            remaining = "";
         }
         for (int i = 0; i < numLetters; i++)
         {
            char c = letters.charAt(i);
            mnemonicSoFar = mnemonicSoFar + Character.toString(c);
            recursiveALG(sol, mnemonicSoFar, remaining);
         }
      }
   }

   public static String digitLetters(char input)
   {
      String sol = "";

      switch (input)
      {
      case '2':
         sol = "ABC";
         break;

      case '3':
         sol = "DEF";
         break;

      case '4':
         sol = "GHI";
         break;

      case '5':
         sol = "JKL";
         break;

      case '6':
         sol = "MNO";
         break;

      case '7':
         sol = "PQRS";
         break;

      case '8':
         sol = "TUV";
         break;

      case '9':
         sol = "WXYZ";
         break;
      }
      return sol;
   }
}
