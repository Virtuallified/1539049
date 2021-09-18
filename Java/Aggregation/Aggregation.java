
class Employee
{
	int id;
	String name;
	Address address;
	Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void show()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address.city+" "+address.state+" "+address.country);
	}
}

class Address 
{

	String city,state,country;
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;	
	}
	
}

public class Aggregation
{
	public static void main(String args[])
	{
		Address add=new Address("Kolkata","West Bengal","India");
		Employee emp=new Employee(1001,"Arnab",add);	
		emp.show();
	}
}