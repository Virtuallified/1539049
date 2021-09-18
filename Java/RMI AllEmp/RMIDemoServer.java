import java.rmi.Naming;

public class RMIDemoServer
{
	public static void main(String args[]) throws Exception
	{
		RMIDemoImpl rmiDemoImpl=new RMIDemoImpl();
		Naming.rebind("RMIDemo",rmiDemoImpl);
		System.out.println("RMI Object Found");
	}
}