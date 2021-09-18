import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfirmCart extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><head>");
		out.println("<title>Show Cart</title></head>");
		out.println("<body>");
		Cookie cookie=null;
		Cookie[] cookies=null;
		cookies = req.getCookies();
		if(cookie!=null);
		{
			out.println("<table border='1' style='width:20%' align='center'>");
			for(int i=0;i<cookies.length;i++)
			{
				cookie = cookies[i];
				out.println("<tr><td>"+cookie.getName()+"</td><br></tr>");
			}
			out.println("</table>");
		}
		out.println("</body></html>");
	}
}