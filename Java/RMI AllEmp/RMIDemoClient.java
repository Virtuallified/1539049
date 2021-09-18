import java.rmi.Naming;
import java.util.*;

public class RMIDemoClient
{
	public static void main(String args[]) throws Exception
	{
		if(args.length==1)
		{
			String url=new String("rmi://"+args[0]+"/RMIDemo");
			RMIDemo rmiDemo = (RMIDemo)Naming.lookup(url);
			//System.out.println("Enter Employee ID:");
			//Scanner sc=new Scanner(System.in);
			//String id=sc.next();
			String serverReply = rmiDemo.doCommunicate();
			System.out.println("Details are :\n"+serverReply);
		}
		else
		{
			System.err.println("Usage : RMIDemoClient<server><name>");
		}
	}
}
