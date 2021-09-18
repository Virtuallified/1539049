import java.net.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class ServerDB2
{
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	private ServerSocket ss;
	public ServerDB2() throws Exception
	{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			if(con==null)
				System.out.println("Sorry.. Database not connected");
			else
			{
				System.out.println("Connected....Database");
				ss=new ServerSocket(888);	//create socket server
				System.out.println("Connection Established...");
			}
	}
	public void serve() throws Exception
	{
		try
			{
				Socket s=null;
				s=ss.accept();	//connect to client socket
				PrintStream ps=new PrintStream(s.getOutputStream());	//to send data to the client
				BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));	//to read data from client
				String str;
				str=br.readLine();	//receive from client
				int x = Integer.parseInt(str);
				switch(x)
				{
					case 1:
					{
						st=con.createStatement();
						rs=st.executeQuery("select * from employees");
						boolean more=rs.next();
						while(more)
						{
							ps.print(rs.getString("EMPLOYEE_ID")+"\t");
							ps.print(rs.getString("FIRST_NAME")+"\t");
							ps.print(rs.getString("LAST_NAME")+"\t");
							ps.print(rs.getString("EMAIL")+"\t");
							ps.print(rs.getString("PHONE_NUMBER")+"\t");
							ps.print(rs.getString("HIRE_DATE")+"\t");
							ps.print(rs.getString("JOB_ID")+"\t");
							ps.print(rs.getString("SALARY")+"\t");
							ps.print(rs.getString("COMMISSION_PCT")+"\t");
							ps.print(rs.getString("MANAGER_ID")+"\t");
							ps.print(rs.getString("DEPARTMENT_ID"));
							more=rs.next();
						}
						ps.close();
						rs.close();
						st.close();
						break;
					}
					case 2:
					{
						ps.println("Enter the Employee_ID:");
						BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
						String str1;
						str1=br1.readLine();
						int a = Integer.parseInt(str1);
						st=con.createStatement();
						rs=st.executeQuery("select * from employees where EMPLOYEE_ID="+a+"");
						PrintStream ps1=new PrintStream(s.getOutputStream());
						boolean more=rs.next();
						while(more)
						{
							ps1.print(rs.getString("FIRST_NAME")+"\t");
							ps1.print(rs.getString("EMPLOYEE_ID")+"\t");
							ps1.print(rs.getString("LAST_NAME")+"\t");
							ps1.print(rs.getString("EMAIL")+"\t");
							ps1.print(rs.getString("PHONE_NUMBER")+"\t");
							ps1.print(rs.getString("HIRE_DATE")+"\t");
							ps1.print(rs.getString("JOB_ID")+"\t");
							ps1.print(rs.getString("SALARY")+"\t");
							ps1.print(rs.getString("COMMISSION_PCT")+"\t");
							ps1.print(rs.getString("MANAGER_ID")+"\t");
							ps1.print(rs.getString("DEPARTMENT_ID"));
							more=rs.next();
						}
						ps1.close();
						st.close();
						rs.close();
						break;
					}
					case 3:
					{
						ps.println("Enter the Employee_ID:");
						String str1;
						str1=br.readLine();	//receive from client
						int a = Integer.parseInt(str1);
						
						ps.println("Enter the FIRST_NAME:");
						String str2;
						str2=br.readLine();
						
						ps.println("Enter the LAST_NAME:");
						String str3;
						str3=br.readLine();
						
						ps.println("Enter the EMAIL:");
						String str4;
						str4=br.readLine();
						
						ps.println("Enter the PHONE_NUMBER:");
						String str5;
						str5=br.readLine();
						
						ps.println("Enter the HIRE_DATE:");
						String str6;
						str6=br.readLine();
						
						ps.println("Enter the JOB_ID:");
						String str7;
						str7=br.readLine();
						
						st=con.createStatement();
						rs=st.executeQuery("insert into employees(Employee_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID) values("+a+",' "+str2+" ',' "+str3+" ',' "+str4+" ',' "+str5+" ',to_date(' "+str6+" ','dd-mm-yyyy'), ' "+str7+" ') ");
						ps.print("Details inserted successfully....");
						ps.close();
						rs.close();
						st.close();
					}
					case 4:
					{
						ps.println("Enter the Employee ID which you want to update:");
						String str1;
						str1=br.readLine();	//receive from client
						int a = Integer.parseInt(str1);
						
						ps.println("Enter the FIRST_NAME:");
						String str2;
						str2=br.readLine();
						
						ps.println("Enter the LAST_NAME:");
						String str3;
						str3=br.readLine();
						
						ps.println("Enter the EMAIL:");
						String str4;
						str4=br.readLine();
						
						ps.println("Enter the PHONE_NUMBER:");
						String str5;
						str5=br.readLine();
												
						st=con.createStatement();
						rs=st.executeQuery("update employees set FIRST_NAME=' "+str2+" ',LAST_NAME=' "+str3+" ',EMAIL=' "+str4+" ',PHONE_NUMBER=' "+str5+" ' where EMPLOYEE_ID="+a+"");
						ps.print("Details updated successfully....");
						ps.close();
						rs.close();
						st.close();
					}
					case 5:
					{
						ps.println("Enter the Employee ID which you want to delete:");
						String str4;
						str4=br.readLine();
						st=con.createStatement();
						int z = Integer.parseInt(str4);
						rs=st.executeQuery("delete from employees where EMPLOYEE_ID='"+z+"'");
						ps.println("Successfully Deleted...");
						ps.close();
						rs.close();
						st.close();
						break;
					}
				}
				st.close();
				br.close();
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public static void main(String arg[]) throws Exception
	{
		ServerDB2 st=new ServerDB2();
		for(;;)
		st.serve();
	}
}