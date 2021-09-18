public class ThirdInteger_ifelse
{
	public static void main(String args[])
	{
		int i=2,sum=0;
		while (i<100)
		{	
			if (i%5==0)
			{
			sum=sum+i;	
			System.out.println(i);
			}
		i=i+3;
		}
		System.out.println(sum);
	}
}

