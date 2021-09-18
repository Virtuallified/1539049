public class SumAllDigit
{
	public static void main (String args[])
	{
		int sum;
		System.out.println("Enter 3 digits");
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		sum=a+b+c;
		System.out.println("The Sum will be : " +sum);
	}
}