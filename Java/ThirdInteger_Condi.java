public class ThirdInteger_Condi
{
	public static void main(String args[])
	{
		int i=2,sum=0,v=0;
		while (i<100)
		{	
		v=i%5==0 ? sum=sum+i : 0;
		i=i+3;
		}
		System.out.println(sum);
	}
}

