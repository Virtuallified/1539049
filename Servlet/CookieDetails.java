import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieDetails extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Cookie cookie=null;
		Cookie[] cookies=null;
		if(cookies!=null);
		{
			for(int i=0;i<cookies.length;i++)
			{
				cookie = cookies[i];
				out.println(cookie.getName());
				out.println(cookie.getValue());
				out.println(cookie.getPath());
			}
		}
		out.println("</body></html>");
	}
}