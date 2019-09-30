import java.util.Scanner;
public class run {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Board B = new Board();
int die1, die2;
boolean legalMove;
String choice=" ";
while (!choice.equalsIgnoreCase("Q")) {
System.out.println("\n"+B);
die1 = (int)(1 + Math.random()*6);
die2 = (int)(1 + Math.random()*6);
legalMove=false;
System.out.println("Dice roll: " + die1 + " " + die2);
while (!legalMove) {
System.out.print("What is your move (V=values, S=sum, Q=quit)? ");
choice=in.next();
if (choice.equalsIgnoreCase("Q"))
legalMove=true;
else if (choice.equalsIgnoreCase("S") && B.removeTile(die1+die2))
legalMove=true;
else if (choice.equalsIgnoreCase("V") && B.removeTiles(die1, die2))
legalMove=true;
else if (choice.equalsIgnoreCase("S")) {

}
else if (choice.equalsIgnoreCase("V")) {

}
else System.out.println("Try again.");
}
}
System.out.println("\n"+B);
System.out.println("Score = " + B.score());
}
}
