import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class TeamClient{

	public static void main(String[] args)
	{
		Team a = new Team();
		System.out.println(a);
		System.out.println(Team.WinningPercentage());

		Team b = new Team("Team b",5,5);
		System.out.println(b);
		System.out.println(Team.WinningPercentage());

		Team c = new Team("Team c",6,5);
		System.out.println(c.getname()+" "+c.getwins()+" "+c.getlosses());
    System.out.println(Team.WinningPercentage());
		System.out.println(Team.getMaxWins());
		Team.WinningPercentage();

		Team d = new Team("Team d",7,6);
		System.out.println(d);
		System.out.println(Team.WinningPercentage());

		System.out.println(Team.getMaxWins());

		a.setwins(10);
		System.out.println(a);
		System.out.println(Team.getMaxWins());
		System.out.println(Team.WinningPercentage());
	}

}
