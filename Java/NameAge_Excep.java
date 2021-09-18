import java.util.*;
class AgeNotwithinRangeExcption extends Exception
{
    public String toString()
	{
		return "Age not within Range";
	}
}

class NameNotValidException extends Exception
{
	public String toString()
	{
		return "Name not valid";
	}
}

class Student
{
	int roll,age;
	String name,course;
	
	Student(int roll,int age,String name,String course)
	{
		this.roll=roll;
		this.age=age;
		this.name=name;
		this.course=course;
	}
	
	void show()
	{
		System.out.println("\n Roll no :"+roll+" "+"Age :"+age+" "+"Name :"+name+" "+"Course :"+course);
	}
}

public class NameAge_Excep
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int rl,ag;
		String nm,crs;
		
		
		System.out.println("Enter Roll No. :");
		rl=sc.nextInt();
		System.out.println("Enter Age :");
		ag=sc.nextInt();
		try
		{
			if(ag>=15 && ag<=21)
				ag=ag;
			else
				throw new AgeNotwithinRangeExcption();
		}
		catch(AgeNotwithinRangeExcption age)
		{
			System.out.println("Exception Caught " +age);
		}
		
		System.out.println("Enter Name :");
		nm= sc.next();
		try
		{
			for(int i=0;i<nm.length();i++)
			{
				int c = (int)nm.charAt(i);
				if(c >=65 && c <=90 || c >=97 && c <=122)
				{
					nm=nm;
				}
				else
					throw new NameNotValidException();			
			}
		}
		catch(NameNotValidException n)
		{
			System.out.println("Exception Caught " +n);
		}
		
		System.out.println("Enter Course :");
		crs= sc.next();
		
		Student s= new Student(rl,ag,nm,crs);
		s.show();		
	}
	
}




















