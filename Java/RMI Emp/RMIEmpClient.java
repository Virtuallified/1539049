import java.rmi.Naming;
import java.util.*;

public class RMIEmpClient
{
	public static void main(String args[]) throws Exception
	{
		if(args.length==1)
		{
			String url=new String("rmi://"+args[0]+"/RMIEmp");
			RMIEmp rmiEmp = (RMIEmp)Naming.lookup(url);
			System.out.println("Enter Employee ID:");
			Scanner sc=new Scanner(System.in);
			String id=sc.next();
			String serverReply = rmiEmp.doCommunicate(id);
			System.out.println("Details are :\n"+serverReply);
		}
		else
		{
			System.err.println("Usage : RMIEmpClient<server><name>");
		}
	}
}
