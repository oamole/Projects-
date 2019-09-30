import java.util.*;

public class Elimination{

  private int [] board = new int[12];
  private String [] takenPositions = new String[12];
  private int score;
  private Random rndGen = new Random();

  public Elimination(){
    //initialize all slots to be null or not taken
    for(int i =0; i < takenPositions.length; i++){
      takenPositions[i] = ".";
    }

    //initialize slots of printBoard
    for(int i =0; i < board.length; i++){
      board[i] = i+1;
    }
  }

  int getScore(){
    return score;
  }

  void printBoard(){
    //print board positions
    for(int i =0; i < board.length; i++){
      System.out.print(board[i] + " ");
    }

    //print space
    System.out.println();

    //print board taken positions
    for(int i =0; i < takenPositions.length; i++){
      System.out.print(takenPositions[i] + " ");
    }

    System.out.println();
  }

  int rollDice(){
    //6 is the maximum you can get and 1 is the minimum
    return rndGen.nextInt(6) + 1;
  }



  //sum two positions
  boolean sumMove(int sum){
    if(takenPositions[sum].equals(".")){
      takenPositions[sum] = "X";
      return true;
    }
    else{
      return false;
    }
  }

  //mark two positions as taken
  boolean  placeValues(int firstIndex, int secondIndex){
    //if both positions are available
    if(takenPositions[firstIndex].equals(".") && takenPositions[secondIndex].equals(".")){
      takenPositions[firstIndex] = "X";
      takenPositions[secondIndex] = "X";
      return true;
    }
    else{
      return false;
    }

  }

}
