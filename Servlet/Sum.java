/*Design a form to input two numbers using html.Use the submit button to get their sum through Servlet*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Sum extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Summation</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("</h1>Enter two numbers for addition</h1><br>");
		out.println("<form action=\"");
		out.println("Summation\" method=POST>");
		out.println("<h1>Enter 1st No. <input type=text lenght=4 name=one></h1><br>");
		out.println("<h1>Enter 2nd No. <input type=text lenght=4 name=two></h1><br>");
		out.println("<input type=submit value=Display>");
		int v1=Integer.parseInt(request.getParameter("one"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		int v2=Integer.parseInt(request.getParameter("two"));
		int sum=v1+v2;
		out.println("<h1>Total = "+ sum +"</h1><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}