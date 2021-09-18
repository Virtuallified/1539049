class WholeClass
{
	int x=10;
	void showDisplay()
	{
		Part p=new Part();
		p.display();
	}
}
class Part
	{
		
	void display()
	{
		System.out.println("The Value :"+x);
	}
}

public class Composition
{
	public static void main(String args[])
	{
		WholeClass obj= new WholeClass();
		obj.showDisplay();
	}
}
