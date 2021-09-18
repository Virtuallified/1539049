/*Design a form to input two numbers using html.Use the submit button to get their sum through Servlet*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Summation extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int v1=Integer.parseInt(request.getParameter("one"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		int v2=Integer.parseInt(request.getParameter("two"));
		int sum=v1+v2;
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Summation</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Total = "+ sum +"</h1><br>");
		out.println("</body>");
		out.println("</html>");
	}
}