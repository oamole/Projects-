import java.util.*;

public class EliminationClient {
  public static void main(String[] args){

    Elimination game = new Elimination();
    Scanner input = new Scanner(System.in);
    String nextMove;

    game.printBoard();

    int firstRoll = game.rollDice();
    int secondRoll = game.rollDice();

    System.out.println("Dice roll: " + firstRoll + " " + secondRoll);
    System.out.print("What is your move: (V=values, S = sum, Q = quit) ");
    nextMove = input.next();

    while(!(nextMove.toLowerCase().equals("q"))){
      if(nextMove.toLowerCase().equals("v")){
        //if slots are not taken
        if(game.placeValues(firstRoll-1, secondRoll-1)){
          System.out.println();
          game.printBoard();
          firstRoll = game.rollDice();
          secondRoll = game.rollDice();
          System.out.println("Dice roll: " + firstRoll + " " + secondRoll);
          System.out.print("What is your move: (V=values, S = sum, Q = quit) ");
          nextMove = input.next();
        }
        //slots are taken
        else{
          System.out.println("Try again.");
          System.out.print("What is your move: (V=values, S = sum, Q = quit) ");
          nextMove = input.next();
        }
      }
      else if(nextMove.toLowerCase().equals("s")){
        if(game.sumMove((firstRoll + secondRoll)-1)){
          System.out.println();
          game.printBoard();
          firstRoll = game.rollDice();
          secondRoll = game.rollDice();
          System.out.println("Dice roll: " + firstRoll + " " + secondRoll);
          System.out.print("What is your move: (V=values, S = sum, Q = quit) ");
          nextMove = input.next();
        }
        else{
          System.out.println("Try again.");
          System.out.print("What is your move: (V=values, S = sum, Q = quit) ");
          nextMove = input.next();
        }
      }
      else{
        System.out.println("Not a valid move. Try again");
        nextMove = input.next();
      }
    }

    System.out.println("Score = " + game.getScore());
  }
}
