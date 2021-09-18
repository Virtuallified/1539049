import java.util.Scanner;

class Vehicle
{
	String company;
	double price;
}
class LightMotorVehicle extends Vehicle
{
	double mileage;

	LightMotorVehicle()
	{
		company="";
		price=0.0;
		mileage=0.0;
	}
	LightMotorVehicle(String com,double pri,double mil)
	{
		company=com;
		price=pri;
		mileage=mil;
	}
	void vehicle_display()
	{
		System.out.println("Name of Company: "+company);
		System.out.println("Vehicle Price: "+price);
		System.out.println("Mileage: "+mileage);
	}
}
class HeavyMotorVehicle extends Vehicle
{
	double capacity_in_tons;

	HeavyMotorVehicle()
	{
		company="";
		price=0.0;
		capacity_in_tons=0.0;
	}
	HeavyMotorVehicle(String com,double pri,double cap)
	{
		company=com;
		price=pri;
		capacity_in_tons=cap;
	}
	
	void vehicle_display()
	{	
		System.out.println("Name of Company: "+company);
		System.out.println("Vehicle Price: "+price);
		System.out.println("Capacity in Tons: "+capacity_in_tons);
	}
}

public class Vehicle_Details
{
	public static void main(String args[])
	{
		String com;
		int input,l=0,h=0;
		double pri,mil,cap;

		Scanner sc=new Scanner(System.in);

		LightMotorVehicle lgh[]=new LightMotorVehicle[3];
		HeavyMotorVehicle hvy[]=new HeavyMotorVehicle[3];

		System.out.println("Enter 1 for LightMotorVehicle type of Vehicle");		
		System.out.println("Enter 2 for HeavyMotorVehicle type of Vehicle");
		input=sc.nextInt();
		
		while(input<3)
		{
			switch(input)
			{
				case 1:
					if(l<3)
					{
						System.out.println("Enter Name of Company: ");
						com=sc.next();
						System.out.println("Enter Vehicle Price: ");
						pri=sc.nextDouble();
						System.out.println("Enter Mileage: ");
						mil=sc.nextDouble();
						lgh[l++]=new LightMotorVehicle(com,pri,mil);
					}
					else
						System.out.println("Array is full");
					break;	
			

		
				case 2:
					if(h<3)
					{
						System.out.println("Enter Name of Company: ");
						com=sc.next();
						System.out.println("Enter Vehicle Price: ");
						pri=sc.nextDouble();
						System.out.println("Enter Capacity of the vehicle in Tons: ");
						cap=sc.nextDouble();
						hvy[h++]=new HeavyMotorVehicle(com,pri,cap);
					}
					else
						System.out.println("Array is full");
					break;
	
				case 3: 
					break;
			}
			System.out.println("Enter 1 for LightMotorVehicle type of Vehicle");		
			System.out.println("Enter 2 for HeavyMotorVehicle type of Vehicle");
			input=sc.nextInt();
			if (l==3 && h==3)
			break;		
		}
		
		for(int i=0;i<3;i++)
		{
			lgh[i].vehicle_display();
		}

		for(int i=0;i<3;i++)
		{
				
			hvy[i].vehicle_display();
		}

	}
}