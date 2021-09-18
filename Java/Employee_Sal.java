
import java.util.Scanner;
/**
 *
 * @author Subhradip
 */
class Employee
{
    private int id;
    private String name,department;
    private double salary;
    Employee()
    {
        id=0;
        name="";
        department="";
        salary=0.0;
    }
    Employee(int i,String n,String d,double s)
    {
        id=i;  
        name=n;
        department=d;
        salary=s;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID: ");
        id=sc.nextInt();
        System.out.println("Enter Name: ");
        name=sc.next();
        System.out.println("Enter Department: ");
        department=sc.next();
        System.out.println("Enter Salary: ");
        salary=sc.nextDouble();
    }
    public void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
    }
	double getsal()
	{
		return salary;
	}
}
class Manager extends Employee
{
    private double bonus,maxsal;
	
    Manager()
    {
        bonus=0.0;
		maxsal=0;
    }
    Manager(double b)
    {
        bonus=b;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        super.accept();
		System.out.println("Enter Bonus: ");
        bonus=sc.nextDouble();
    }
	public void calc()
	{
	maxsal=bonus+super.getsal();
	}
   
	public void display()
	{
	super.display();
	System.out.println("Bonus: "+bonus);
	System.out.println("maxsal: "+maxsal);
	}

   
		public static Manager max(Manager mgr[])
    {
        Manager temp=new Manager();
		double mx=mgr[0].maxsal;
		
		for (int i=0;i<3;i++)
		{
			
				if (mx<mgr[i].maxsal)
				{
					mx=mgr[i].maxsal;
					temp=mgr[i];
				}
		}
		return temp;
    } 
	
    }
        

    public class Employee_Sal 
    {
        public static void main(String[] args) 
        {
            Manager m[]=new Manager[3];
            
            for(int i=0;i<3;i++)
            {
				m[i]=new Manager();     
                m[i].accept();
				m[i].calc();
            }
            System.out.println(" All The managers Data : " );
			for(int i=0;i<3;i++)
            {
				     
                m[i].display();
            }
			Manager ob=new Manager();
			
			ob=Manager.max(m);
			System.out.println(" The manager having highest MaxSal " );
			ob.display();
        }
}