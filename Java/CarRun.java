class Car
{
	int year;
	String make;
	double speed;

	double getSpeed(double d1)
	{
		return d1;
	}
	int showYear(int yr)
	{	
		return yr;
	}
	String Make(String s1)
	{
		make=s1;
		return make;
	}
	double Accelerate(double a1)
	{
		speed=a1+1;
		return speed;
	}
}
public class CarRun
{
	public static void main(String args[])
	{
		String x; double y, z; int s;
		Car nCar=new Car();
		
		x=nCar.Make("Chevrolet");
		y=nCar.getSpeed(120.25);
		s=nCar.showYear(2015);
		z=nCar.Accelerate(y);

		System.out.println("The Speed is: " +x);
		System.out.println("The year of Model: " +s);
		System.out.println("The Making Company: " +y);
		System.out.println("The Accelerated speed is: " +z);
	}
}