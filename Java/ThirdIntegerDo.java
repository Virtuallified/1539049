public class ThirdIntegerDo
{
	public static void main(String args[])
	{
		int i=2,sum=0;
		do
		{
		sum=sum+i;
		System.out.println(i);
		i=i+3;
		} while (i<100);
		System.out.println(sum);
	}
}