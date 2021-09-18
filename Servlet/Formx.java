import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Formx extends HttpServlet
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
		out.println("<table>");
			out.println("<tr>");
				out.println("<td>Enter Your Name : </td>");
				out.println("<td><input type=text value=Name></td>");
			out.println("</tr>");
			out.println("<tr>");
				out.println("<tr><td>Enter Your Roll : </td>");
				out.println("<td><input type=text value=Roll></td></tr>");
			out.println("<tr>");
			out.println("</tr>");
				out.println("<tr><td>Enter Your Course : </td>");
				out.println("<td><input type=text value=Course></td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<tr></tr>");
				out.println("<td><input type=submit action=submit value=Submit></td>");
				out.println("<td><input type=reset action=submit value=Reset></td>");
			out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	} //doGet
} //Formx