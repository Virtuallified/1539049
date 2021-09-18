import java.util.*;
abstract class Player
{
	String name;
	int match_played;
	int highest_score;

	public abstract void display();
}
	
	class Batsman extends Player
	{
		int score;
		public Batsman()
		{
			super.name="Saynesh";
			super.match_played=56;
			super.highest_score=206;
	
		}
		
		public void display()
		{
			System.out.println("Player name :"+ super.name);
			System.out.println("Matches Player played :" + super.match_played);
			System.out.println("Player Highest Score :"+super.highest_score);		
		}
		
		public void setScore()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter score made by player :");
			score= sc.nextInt();
		}
		
		public void getScore()
		{
			System.out.println("Highest score made by player :" +score);
		}
		
	}

 public	class PlayerInfo
 {
	public static void main(String arg[])
	{
		Batsman bm1= new Batsman();
		bm1.display();
		bm1.setScore();
		bm1.getScore();
		
	}
 }