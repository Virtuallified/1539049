import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Table extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int n=Integer.parseInt(req.getParameter("num"));
		out.println("<html><head>");
		out.println("<title>Table</title></head>");
		out.println("<body>");
		out.println("<table border='1' style='width:20%'>");
		for(int i=1;i<=10;i++)
		{
			int rs = n*i;
			out.println("<tr>");
			out.println("<td>"+ n +"</td><td> * </td><td>"+ i +"</td><td> = </td><td>"+ rs +"</td><br>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
	}
}