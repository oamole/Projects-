import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args)
   {
      System.out.println("Enter string: ");
      Scanner scan  = new Scanner(System.in);
      String  input = scan.nextLine();

      isPalindrome(input);
   }

   private static boolean isPalindrome(String str)
   {
      if ((str.length() == 0) || (str.length() == 1))
      {
System.out.println("The word is a Palindrome");
         return true;

      }
      if (str.charAt(0) != str.charAt(str.length() - 1))
      {
         if ((str.charAt(0) == ' ') && ((str.charAt(str.length() - 1)) != ' '))
         {
            return isPalindrome(str.substring(1, str.length() - 0));
         }
         else if ((str.charAt(str.length() - 1) == ' ') && (str.charAt(0) != ' '))
         {
            return isPalindrome(str.substring(0, str.length() - 1));

         }
         else
         {
            return false;
         }
      }

      return isPalindrome(str.substring(1, str.length() - 1));
   }
}
