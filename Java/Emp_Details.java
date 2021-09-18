import java.io.*;
import java.sql.*;
import java.util.*;

class Emp_Details
{
	public static void main(String arg[]) 			
	{
		int dcsn;
		Scanner sc=new Scanner(System.in);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			if(con==null)
				System.out.println("Sorry.. Database not connected");
			else
				System.out.println("Connected....");
				
			
			Statement st=null;
			ResultSet rs=null;
			boolean more;
			
			do
						{
							System.out.println("\n1:Show Employee - Enter E_ID");
							System.out.println("2:Show all Employees");
							System.out.println("3:Add New Employee");
							System.out.println("4:Modify Existing Employee");
							System.out.println("5:Delete Employee - Enter E_ID");
							System.out.println("6:Exit.");
							System.out.println("\nEnter your choice:");
							
							dcsn=sc.nextInt();
							switch(dcsn)
							{
									case 1:
											System.out.println("Enter E_ID");
											int id=sc.nextInt();
											
											st=con.createStatement();
											rs=st.executeQuery("select * from employees where employee_id='"+id+"'");
											
											more=rs.next();
											while(more)
											{
												System.out.print(rs.getString("EMPLOYEE_ID")+"\t");
												System.out.print(rs.getString("FIRST_NAME")+"\t");
												System.out.print(rs.getString("LAST_NAME")+"\t");
												System.out.print(rs.getString("EMAIL")+"\t");
												System.out.print(rs.getString("PHONE_NUMBER")+"\t");
												System.out.print(rs.getString("HIRE_DATE")+"\t");
												System.out.print(rs.getString("JOB_ID")+"\t");
												System.out.print(rs.getString("SALARY")+"\t");
												System.out.print(rs.getString("COMMISSION_PCT")+"\t");
												System.out.print(rs.getString("MANAGER_ID")+"\t");
												System.out.print(rs.getString("DEPARTMENT_ID"));
												more=rs.next();
											}
										   break;
									case 2:
											st=con.createStatement();
											rs=st.executeQuery("select * from employees");
											
											more=rs.next();
											while(more)
											{
												System.out.print(rs.getString("EMPLOYEE_ID")+"\t");
												System.out.print(rs.getString("FIRST_NAME")+"\t");
												System.out.print(rs.getString("LAST_NAME")+"\t");
												System.out.print(rs.getString("EMAIL")+"\t");
												System.out.print(rs.getString("PHONE_NUMBER")+"\t");
												System.out.print(rs.getString("HIRE_DATE")+"\t");
												System.out.print(rs.getString("JOB_ID")+"\t");
												System.out.print(rs.getString("SALARY")+"\t");
												System.out.print(rs.getString("COMMISSION_PCT")+"\t");
												System.out.print(rs.getString("MANAGER_ID")+"\t");
												System.out.print(rs.getString("DEPARTMENT_ID"));
												more=rs.next();
											}
										   break;
									case 3:
											
												
										   break;
									case 4:
												System.out.println("Enter the Employee ID which you want to update:");
												int a=sc.nextInt();
												System.out.println("Enter the FIRST_NAME:");
												String b=sc.next();
												System.out.println("Enter the LAST_NAME:");
												String c=sc.next();
												System.out.println("Enter the EMAIL:");
												String d=sc.next();
												System.out.println("Enter the PHONE_NUMBER:");
												String e=sc.next();				
												System.out.println("Enter the SALARY:");
												Double f=sc.nextDouble();
												System.out.println("Enter the COMMISSION_PCT:");
												Double g=sc.nextDouble();
												st=con.createStatement();
												rs=st.executeQuery("update employees set FIRST_NAME=' "+b+" ',LAST_NAME=' "+c+" ',EMAIL=' "+d+" ',PHONE_NUMBER=' "+e+" ',SALARY="+f+",COMMISSION_PCT="+g+" where EMPLOYEE_ID='"+a+"' ");
												System.out.println("Details updated successfully....");
										   break;
									case 5:
												System.out.println("Enter the Employee ID which you want to delete:");
												int z=sc.nextInt();
												st=con.createStatement();
												rs=st.executeQuery("delete from employees where EMPLOYEE_ID='"+z+"'");
												more=rs.next();
												System.out.println("Successfully deleted.");
										   break;	   
									case 6:System.exit(0);
										   break;
										   
									default:System.out.println("\nInvalid choice:");
							}
						}while(dcsn!=7);
			
			rs.close();
			st.close();
			con.close();
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
}
