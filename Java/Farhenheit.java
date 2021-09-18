public class Farhenheit
{
	public static void main (String args[])
	{
		double c=0,sum;
		Double f=Double.parseDouble(args[0]);
		c=(5.0/9.0)*(f-32);
		System.out.println("Converted to :"+c+" Degree Celcius");
	}
}