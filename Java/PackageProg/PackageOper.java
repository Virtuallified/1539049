import Maths.MathOperations;
import Stats.StatsOperations;
import java.util.Scanner;

public class PackageOper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MathOperations mo=new MathOperations();
		StatsOperations so=new StatsOperations();

		System.out.println("Enter 3 integer no.s");
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		
		mo.MAX(x,y,z);
		mo.MIN(x,y,z);
		so.average(x,y,z);
		so.median(x,y,z);
		
	}
}