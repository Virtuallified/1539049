import java.rmi.Naming;

public class RMIEmpServer
{
	public static void main(String args[]) throws Exception
	{
		RMIEmpImpl rmiEmpImpl=new RMIEmpImpl();
		Naming.rebind("RMIEmp",rmiEmpImpl);
		System.out.println("RMI Object Found");
	}
}