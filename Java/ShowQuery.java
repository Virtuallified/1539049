import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ShowQuery extends HttpServlet
{
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	private ResultSetMetaData rsmd = null;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			String tbl=req.getParameter("num");
			int NumOfCol=0;
			
			
			st = con.createStatement();
			rs = st.executeQuery("select * from "+tbl);
			rsmd = rs.getMetaData();
			NumOfCol=rsmd.getColumnCount();
			
			out.println("<html><head>");
			out.println("<title>ShowQuery</title></head>");
			out.println("<body>");
			out.println("<h2>You have searched for Table : "+ tbl +"</h2>");
			out.println("<table border=1>");
			while(rs.next())
			{
				out.print("<tr>");
				for(int i=1;i<=NumOfCol;i++)
				out.print("<td>"+ rs.getString(i) +"</td>");
			}
			out.print("</tr>");
			out.println("</table>");
			out.println("</body></html>");
			
			
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			res.setContentType("text/plain");
			PrintWriter out=res.getWriter();
			out.println(e);
			//throw new UnavailableException(this. "Couldn't load database driver");
		}
		catch(SQLException e)
		{
			res.setContentType("text/plain");
			PrintWriter out=res.getWriter();
			out.println(e);
			System.out.println("database not found");
			//throw new UnavailableException(this. "Couldn't get database Connection");
		}	
	}
}