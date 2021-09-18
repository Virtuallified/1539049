import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;

class HelloImpl extends HelloPOA
{
	private ORB orb;
	public void setORB(ORB orb_val)
	{
		orb=orb_val;
	}
	public String sayHello()
	{
		return "\n hello world!! \n";
	}
	/*public void shutdown() 
	{
		orb.shutdown(false);
	}*/
}

public class HelloServer
{
	public static void main(String args[])
	{
		try
		{
			//create and initialize the ORB
			ORB orb=ORB.init(args,null);
			
			//get reference to rootpoa & activate the POAManager
			POA rootpoa=POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
			
			//create servant & register it with the ORB
			HelloImpl helloImpl=new HelloImpl();
			helloImpl.setORB(orb);
			
			//get object reference from servant
			org.omg.CORBA.Object ref=rootpoa.servant_to_reference(helloImpl);
			Hello href=HelloHelper.narrow(ref);
			
			//get the root naming context
			//NameService invokes the name service
			org.omg.CORBA.Object objref=orb.resolve_initial_references("NameService");
			
			//use NamingContextExt which is a part of InterOperable Naming Service(INS) specification
			NamingContextExt ncRef=NamingContextExtHelper.narrow(objref);
			
			//bind the object reference in naming
			String name="Hello";
			NameComponent path[] = ncRef.to_name(name);
			ncRef.rebind(path,href);
			System.out.println("Hello server ready and waiting ......");
			
			//wait for invocations from the client
			orb.run();
		}
		catch(Exception e)
		{
			System.err.println("Error : "+e);
			e.printStackTrace(System.out);
		}
		System.out.println("HelloServer Exiting....");
	}
}