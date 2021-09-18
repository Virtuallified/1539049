import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculation extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Calculation</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Enter two numbers and the operator</h1>");
		out.println("<form action=\"");
		out.println("Results\" method=POST>");
		out.println("<h1>Enter 1st No. <input type=text length=4 name=one></h1><br>");
		out.println("<h1>Enter 2nd No. <input type=text length=4 name=two></h1><br>");
		out.println("<h1>Operator = <input type=text length=4 name=opr>");
		out.println("<input type=submit value=Display>");
		out.println("</body>");
		out.println("</html>");
	}
}