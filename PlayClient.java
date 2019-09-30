package Midterm.Client;
import Midterm.Service.Team;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class TeamClient{
	Team[] myArray;

	public Team[] sortPercentage(Team[] teamArray){
		for (int i = 0; i < teamArray.length; i++) {
			int min = i;
			for (int j = i + 1; j < teamArray.length; j++) {
				if (teamArray[min].winningPercentage() > teamArray[j].winningPercentage()) {
					min = j;
				}
			}
			Team[] myArray = teamArray[i];
			teamArray[i] = teamArray[min];
			teamArray[min] = myArray;
		}
		return teamArray;
	}
	public static void main(String args[]){
		String line = new String();
		try{
			TeamClient client = new TeamClient();
			// Team ateam;
			File textFile = new File("TeamTxt.txt");
			Scanner scan = new Scanner(textFile);
			Scanner scan2 = new Scanner(textFile);
			int lineCount = 0;

			while (scan.hasNextLine()) {
				lineCount++;
			}
			Team[] teamArray = new Team[lineCount];

			int arrayCount = 0;
			while(scan2.hasNextLine())
			{
				// ArrayCount++;
				line=scan2.nextLine();
				String []tok=line.split(":");
				String name=tok[0];
				int wins=Integer.parseInt(tok[1]);
				int losses=Integer.parseInt(tok[2]);
				teamArray[arrayCount] = new Team(name, wins, losses);
				arrayCount++;
			}

			client.sortPercentage(teamArray);
			client.toString();


		}catch(IOException e){
			System.out.println("Issuse with reading the file. Aborting");
			System.out.println(e.getMessage());
		}
	}
}
