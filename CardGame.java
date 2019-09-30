package library.client.classes;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import carddeck.service.classes.*;


/*Task 2: Import necessary user defined classes */


class CardGame{
	Card A = new Card(CardSign.DIAMOND, CardValue.ACE);
		Card B = new Card(CardSign.SPADE, CardValue.FIVE);
	Card [] userHand;
	Card [] dealerHand;


    private void generateDealerHand(){
			int min=0;
	int max=3;
	int min2=0;
	int max2=12;
	int rndVal;
	int rndVal2;
	int range = max-min+1;
	int range2 = max2-min2+1;
	dealerHand= new Card[userHand.length];
	for(int i=0;i<userHand.length;++i){
		rndVal= (int)(Math.random()*(range)+min);
		rndVal2= (int)(Math.random()*(range2)+min2);
		dealerHand[i]= new Card(CardSign.values()[rndVal],CardValue.values()[rndVal2]);

	}
		/*Task 5: Implement the class method generateDealerHand() in CardGame class. This method will use a random generator to generate signs, and values of the cards for the dealer.*/
	}


	private int getScore(){
		int score=0;
		int userScore=0;
		int dealerScore=0;
	 if(royalFlush(userHand)){
		 userScore+=2;
	 }
	 if(royalFlush(dealerHand)){
		 dealerScore+=2;
	 }
	 if(flush(userHand)){
		 userScore++;
	 }
	 if(flush(dealerHand)){
		 dealerScore++;
	 }

	 if(userScore>dealerScore){
		 return userScore;
	 }else if(userScore==dealerScore){
		 return 0;
	 }else{
	 return -1;
		/*Task 3: Implement the class method getScore() in CardGame class. This method will compare the cards of the dealer and player and provide a score. If the score is zero, it means the game is a tie. If the score is positive, then the player has won the game. You should implement other methods as needed.*/
	}
}
private boolean royalFlush(Card [] bend){
		CardSign n=bend[0].getSign();
		int counter=0;
		for(int i=1;i<bend.length;i++){
			if(bend[i].getSign().equals(n)){
				counter++;
			}
		}
		int count=0;
		for(int i=0;i<bend.length;i++){
			if(bend[i].getValue().equals(CardValue.valueOf("ACE"))||
			bend[i].getValue().equals(CardValue.valueOf("KING"))||
			bend[i].getValue().equals(CardValue.valueOf("QUEEN"))||
			bend[i].getValue().equals(CardValue.valueOf("JACK"))||
			bend[i].getValue().equals(CardValue.valueOf("TEN"))){
				count++;
			}
		}

		if((count==bend.length)&&(counter==(bend.length-1))){
			return true;
		}else return false;

	}
	private boolean flush(Card[] bend){
		 CardSign n=bend[0].getSign();
		int counter=0;
		for(int i=1;i<bend.length;i++){
			if(bend[i].getSign().equals(n)){
				counter++;
			}
		}
		 if((counter==(bend.length-1))){
			return true;
		}else return false;
	}
	private void printHand(){
		System.out.println("User's Hand");
		for(int i=0;i<userHand.length;++i){
			System.out.println(userHand[i].toString());
		}
		System.out.println("Dealer's Hand");
		 for(int i=0;i<userHand.length;++i){
			System.out.println(dealerHand[i].toString());
		}

	}
	public static void main(String []args){
	//arg[0]: file containing user hand
		CardGame game=new CardGame();
		//read the the files from text files
		int counter=0;
		Scanner scan;
		String str;
		try {
			Card aCard;
			File myFile=new File(args[0]);
            scan=new Scanner(myFile);
			while(scan.hasNextLine()){
				str=scan.nextLine();
				String []tok=str.split(":");
				counter++;
			}
				game.userHand= new Card[counter];
			Scanner scans=new Scanner(myFile);
			int y=0;
			while(scans.hasNextLine()){
				str=scans.nextLine();
				String[] tok=str.split(":");
				aCard = new Card(CardSign.valueOf(tok[0]),CardValue.valueOf(tok[1]));
				game.userHand[y]=aCard;
				y++;
			/*Task 4: Implement the code in the main method of the CardGame class, that will take the values read from the text file, create Card objects and populate the array Hand. userHand is an attribute of the CardGame class.*/
			}

		//lets play iPoker!!
		//User interactive part
		String option1;
		scan = new Scanner(System.in);
		int score;
		while(true){
			System.out.println("Select an option:");
			System.out.println("Type \"P\" to play a round of iPoker");
			System.out.println("Type \"Q\" to Quit");
			option1=scan.nextLine();

			switch (option1) {
				case "P":   game.generateDealerHand();
				            score=game.getScore();
							game.printHand();///First print out the hands
							System.out.println("\n\nCompare the two hands:");
							if(score < 0)
								System.out.println("Dealer Wins :-(");
							else if (score == 0)
								System.out.println("Its a draw");
							else if (score > 0)
								System.out.println("Congrats You win !!");
							else
								System.out.println("Somethings wrong!");
							break;

				case "Q":   System.out.println("Quitting program");
							System.exit(0);

				default:	System.out.println("Wrong option! Try again");
							break;

			}
		}
		}catch(IOException ioe){
			System.out.println("The file can not be read");
		}catch(IllegalArgumentException ia){
            System.out.println(ia.getMessage());
		} catch(NullPointerException np){
			System.out.println(np.getMessage());
		}
	}

}
