package Midterm.Service;
import java.util.*;
import java.io.*;

public class Team{
    private String teamName;
    private int numWins;
    private int numLosses;
    private int totalGames;

    // default constructors
    public Team(){
        this.teamName = "No name";
        this.numLosses = 0;
        this.numWins = 0;
        this.totalGames = 0;
    }
    // Non-default constructor
    public Team(String tName, int nWins, int nLoss){
        this.setTeamName(tName);
        this.setNumWins(nWins);
        this.setNumLosses(nLoss);
        // this.setTotalGames(tGames);
    }

    // Accessors
    public String getTeamName(){
        return this.teamName;
    }
    public int getNumWins(){
        return this.numWins;
    }
    public int getNumLosses(){
        return this.numLosses;
    }
    public int getTotalGames(){
        return this.totalGames;
    }

    public void setTeamName(String tName){
        this.teamName = tName;
    }
    public void setNumWins(int nWins){
        this.numWins = nWins;
    }
    public void setNumLosses(int nLosses){
        this.numLosses = nLosses;
    }
    public void setTotalGames(int tGames){
        this.totalGames = this.numWins + this.numLosses;
    }

    //FIXME: Not sure if this is the right implementation.
    public double winningPercentage(){
        double wPercent = this.getNumWins() / (double) this.getNumLosses();
        if (this.totalGames != 0) {
            return wPercent;
        }
        return 0;

    }
    public String toString(){
        //Might have to format to string?
        Double wP = this.winningPercentage();
        String teamCategory = "" + "\n";
        if (this.winningPercentage() >  0.5 ) {
            teamCategory = "Over 500 team";
        }
        else if (this.winningPercentage() == 0.5) {
            teamCategory = "500 team";
        }
        else{
            teamCategory = "Under 500 team";
        }
        String str = "";
        str += "=========================";
        str += "Team: " + this.getTeamName() + "\n";
        str += "Wins: " + this.getNumWins() + "\n";
        str += "Losses: " + this.getNumLosses() + "\n";
        str += "Winning Percentage: " + this.winningPercentage() + "\n";
        str += teamCategory + "\n";
        str += "=========================";

        return str;

    }




}
