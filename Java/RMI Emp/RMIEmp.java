import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIEmp extends Remote
{
	public String doCommunicate (String name) throws RemoteException;
}