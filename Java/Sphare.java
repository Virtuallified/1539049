public class Sphare
{
	public static void main(String args[])
	{
		double v,a,p=3.14159;
		Double r=Double.parseDouble(args[0]);
		v=4*p*r*r*r/3;
		a=4*p*r*r;
		System.out.println("The Volumn of sphare is : "+v);
		System.out.println("The Area of sphare is : "+a);
	}
}