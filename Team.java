public class Team{
  private String name;
  private static int wins;
  private static int losses;
  public  String [] MaxWins = new String[wins];

  public Team(){
    name = "Seyi";
    wins = 0;
    losses = 0;
  }
  public Team(String newname, int newwins, int newlosses){
    name = newname;
    wins = newwins;
    losses = newlosses;
  }
  String getname(){
		return name;
	}
  int getwins(){
    return wins;
  }
  int getlosses(){
    return losses;
  }
  public void setname(String name){
    this.name = name;
  }
  public void setwins(int wins){
    this.wins = wins;
  }
  public void setlosses(int losses){
    this.losses = losses;
  }
  public static double WinningPercentage(){
    int  TotalGames;
    double  WinningPercentage;
    TotalGames = wins +losses;
    if(TotalGames == 0){
      WinningPercentage = 0;
      return WinningPercentage;
    }
    WinningPercentage = wins/TotalGames;
    return WinningPercentage;


  }
  public String toString(){
String msg = "Name is :  " +name +"wins are: " +wins +"losses are: " +losses +"The winning percentage members" +WinningPercentage();

if(WinningPercentage() > 0.5 ){
 System.out.println("Over 500 Team");
 return msg;
}
if(WinningPercentage() < 0.5 ){
  System.out.println("Under 500 Team");
  return msg;
      }
if(WinningPercentage() == 0.5 ){
  System.out.println(" 500 Team");
  return msg;
 }
 return msg;
  }
  public static String getMaxWins(){

String msg = "The max wins are as follows";
return msg;


}
}
