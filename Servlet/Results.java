import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Results extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double v1=Integer.parseInt(request.getParameter("one"));
		double v2=Integer.parseInt(request.getParameter("two"));
		char op=request.getParameter("opr").charAt(0);
		double output=0;
		if (op=='+')
			output=v1+v2;
		else if (op=='-')
			output=v1-v2;
		else if (op=='*')
			output=v1*v2;
		else if (op=='/')
			output=v1/v2;
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Results</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Total = "+ output + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}