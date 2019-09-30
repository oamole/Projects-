public class Die
{
  private final int MAX = 6;
  private  int faceValue;

 public Die(){
      faceValue = 1;

   }

public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;
      return faceValue;
   }

public void setFaceValue (int value)
   {
      faceValue = value;
   }
 public int getFaceValue()
   {
      return faceValue;
   }

public String toString()
   {
      String result = Integer.toString(faceValue);
      return result;
   }
}


public class RollingDie
{

   public static void main (String[] args)
   {
         Die die1;
         Die die2;
         int sum;


           die1 = new Die();
       die2 = new Die();


      die1.roll();
      die2.roll();
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);

      sum = die1.getFaceValue() + die2.getFaceValue();
      System.out.println ("Sum: " + sum);

      sum = die1.roll() + die2.roll();
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
      System.out.println ("Sum: " + sum);



   }
}
