package Maths;

public class MathOperations
{
	public static void MAX(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
				System.out.println("Max: "+a);
		}
		else
		{
			if(b>c)
				System.out.println("Max: "+b);
			else
				System.out.println("Max: "+c);
		}
	}
	public static void MIN(int a,int b,int c)
	{
		if(a<b)
		{
			if(a<c)
				System.out.println("Min: "+a);
		}
		else
		{
			if(c<b)
				System.out.println("Min: "+c);
			else
				System.out.println("Min: "+b);
		}
	}
}