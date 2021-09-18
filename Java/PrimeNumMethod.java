class Number
{
	int  num;
	void primeCheck(int c) 
	{
		int p,i,chk=0;
 		for (i=2;i<c;i++)
 		{
			if (c%i==0) 
			{
				chk=1;
				break;
	 		}
 		}
			if (chk==1) 
 			{
 				System.out.println("This Number is not a Prime No.");
				
 			}
 			else 
 				System.out.println("This Number is a Prime No.");
	}
	void primeRange(int r) 
	{
		int i,j,f=1;
		for(i=1;i<=r;i++)
		{
			f=1;
			for(j=2;j<i;j++)
			{
				if (i%j==0)
				{
					f=0;
					break;
				}
			}
				if (f==1)
				{
					System.out.println(i);
				}
		}
	}
	void factorial(int f)
	{
		int i,fact=1;
		for (i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:" +fact);
	}
}
public class PrimeNumMethod
{
	public static void main(String args[])
	{
		
		Number Prim= new Number ();
		int x=Integer.parseInt(args[0]);
		Prim.primeCheck(x);
		Prim.factorial(x);
		Prim.primeRange(x);
	}
}