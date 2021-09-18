import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class HelloClient
{
	static Hello helloImpl;
	public static void main(String args[])
	{
		try
		{
			//create and initialize the ORB
			ORB orb=ORB.init(args,null);
			
			//get the root naming context
			org.omg.CORBA.Object objRef=orb.resolve_initial_references("NameService");
			
			//use NamingContextExt instead of NamingContext. This is part of InterOperableNaming service
			NamingContextExt ncRef=NamingContextExtHelper.narrow(objRef);
			
			//resolve the object reference in Naming
			String name="Hello";
			helloImpl=HelloHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtain a handle on server object : "+helloImpl);
			System.out.println(helloImpl.sayHello());
		}
		catch(Exception e)
		{
			System.err.println("Error : "+e);
			e.printStackTrace(System.out);
		}
	}
}