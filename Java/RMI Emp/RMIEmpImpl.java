import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.*;
import java.sql.*;
import java.util.*;

public class RMIEmpImpl extends UnicastRemoteObject implements RMIEmp
{
	protected RMIEmpImpl() throws RemoteException
	{
		super();
	}
	public String doCommunicate (String name) throws RemoteException
	{
		String dtl=null;
			try
			{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from employees where EMPLOYEE_ID='"+name+"'");
				boolean more=rs.next();
				dtl=rs.getString("FIRST_NAME")+"\t"
					+rs.getString("LAST_NAME")+"\t"
					+rs.getString("EMAIL")+"\t"
					+rs.getString("PHONE_NUMBER")+"\t"
					+rs.getString("HIRE_DATE")+"\t"
					+rs.getString("JOB_ID")+"\t"
					+rs.getString("SALARY")+"\t"
					+rs.getString("COMMISSION_PCT")+"\t"
					+rs.getString("MANAGER_ID")+"\t"
					+rs.getString("DEPARTMENT_ID");
			}
			catch(SQLException e){}
			catch(Exception e){}
			finally
			{
				return dtl;
			}
	}
}