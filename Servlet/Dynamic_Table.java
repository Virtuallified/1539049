import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Dynamic_Table extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int row = Integer.parseInt(request.getParameter("row"));
		int col = Integer.parseInt(request.getParameter("column"));
		out.print("<html><head><title>Dynamic Table</title></head>");
		out.print("<body><table border=1>");
		for (int i=1;i<=row;i++)
		{
			out.print("<tr>");
			for (int j=1;j<=col;j++)
			{
				out.print("<td>");
				out.print("Welcome to KIIT");
				out.print("</td>");
			}
			out.print("</tr>");
		}
		out.println("</table></body></html>");
	}
}