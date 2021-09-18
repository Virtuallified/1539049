import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmployeeFind extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>HelloServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form>");
		out.println("Enter Employee ID No :");
		out.println("<br></br>");
		out.println("<input type=text value=Put ID>");
		out.println("<input type=submit action=submit value=Submit>");
		out.println("<input type=reset action=submit value=Reset>");
		out.println("</form>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	} 
	
	/*public String doCommunicate (String name) throws RemoteException
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
			}*/
} 