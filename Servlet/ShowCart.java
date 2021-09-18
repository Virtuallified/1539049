import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowCart extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><head>");
		out.println("<title>Show Cart</title></head>");
		out.println("<body><table style='width:20%' align='center'><tr><td>");
		out.println("<select size=10 name=showitem>");
		//out.println("<option selected>");
		Cookie cookie =null;
		Cookie cookies[] = new Cookie[10];
		for(int i=0;i<10;i++)
		{
			String val=req.getParameter(""+i+"");
			if (val!=null)
			{
				out.println("<option>"+val);
				cookie= new Cookie(val, req.getParameter(val));
				cookies[i] = cookie;
				res.addCookie(cookies[i]);
			}
		}
		out.println("</select>");
		out.println("<form action='/ConfirmCart' method=POST><br><input type=submit value=Confirm></input></form>");
		out.println("</td></tr></table></body></html>");
	}
}