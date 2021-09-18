import java.util.Scanner;

class CricketPlayer
{
	String name;
	int no_of_innings,no_times_notout,total_runs;
	double bat_avg;
	
	CricketPlayer()
	{
	}
	CricketPlayer (String nm,int i,int nn,int tr)
	{
		name=nm;
		no_of_innings=i;
		no_times_notout=nn;
		total_runs=tr;	
	}

	void ShowInfo()
	{
		System.out.println("Name : "+name+"\nNo of Innings : "+no_of_innings+"\nNotout Times : "+no_times_notout+"\nTotal Run : "+total_runs);
	}
	
	static void Avg(CricketPlayer c[])
	{
		for(int i=0;i<3;i++)
		c[i].bat_avg=c[i].total_runs/c[i].no_of_innings;
	}

	static void sortPlayer(CricketPlayer d[])
	{
		CricketPlayer temp=new CricketPlayer();
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<i;j++)
			{
				if (d[i].bat_avg>d[j].bat_avg)
				{
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
	}
}
public class Cricket
{
	public static void main(String args[])
	{
		String name1;
		int ni,nn,tr;
		Scanner sc=new Scanner(System.in);
		CricketPlayer P[]=new CricketPlayer[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Player Name :");
			name1=sc.next();
			System.out.println("Enter the no. of innings :");
			ni=sc.nextInt();
			System.out.println("Enter the no. of NotOuts :");
			nn=sc.nextInt();
			System.out.println("Enter the total run :");
			tr=sc.nextInt();
			
			P[i]=new CricketPlayer(name1,ni,nn,tr);
		}
		CricketPlayer.Avg(P);
		for(int i=0;i<3;i++)
		{
			P[i].ShowInfo();
		}
	}
}