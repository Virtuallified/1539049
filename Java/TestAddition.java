class Addition
{
	int sum(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
	double sum(double d1,double d2)
	{
		double d;
		d=d1+d2;
		return d;
	}
	String sum(String s1, String s2)
	{
		String s=" ";
		s=s1+s2;
		return s;
	}
}
public class TestAddition
{
	public static void main(String args[])
	{
		int s; double d; String FN;
		Addition a1=new Addition ();
		s=a1.sum(10,20);
		d=a1.sum(2.5,3.6);
		System.out.println("The sum in double :" +d);
		System.out.println("The sum in integer :" +s);
		FN=a1.sum("Lex"," M");
		System.out.println("The sum in double :" +FN);
	}
}