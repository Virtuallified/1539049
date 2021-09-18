class Fraction
{
	private int num, denom;
	public Fraction()
	{
		num=0;
		denom=1;
	}
	public Fraction(int n)
	{
		num=n;
		denom=1;
	}
	public Fraction(int p,int q)
	{
		num=p;
		denom=q;
		//reduce();
	}
	public Fraction(Fraction other)
	{
		num=other.num;
		denom=other.denom;
	}
	void showFraction()
	{
		System.out.println(num+"/"+denom);
	}
	void Reduce()
	{
		int a=num,b=denom;
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		num=num/a;
		denom=denom/a;		
	}
}
public class TestFraction
{
	public static void main(String args[])
	{
		int i,j,n;
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		Fraction FracR=new Fraction();
		Fraction Frac1=new Fraction();
		Fraction Frac2=new Fraction(x);
		Fraction Frac3=new Fraction(x,y);
		Fraction FracOther=new Fraction(Frac3);

		Frac1.showFraction();
		Frac2.showFraction();
		Frac3.showFraction();
		FracOther.showFraction();
		Frac3.Reduce();

	}
}