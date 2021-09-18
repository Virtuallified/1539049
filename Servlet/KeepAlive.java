import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class KeepAlive extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		//Setup a PrintStream built around a special output stream
		ByteArrayOutputStream bytes = new ByteArrayOutputStream (1024);
		PrintWriter out=new PrintWriter(bytes,true);	//true forces flushing
		out.println("<html>");
		out.println("<head><title>Hello World</title></head>");
		out.println("<body>");
		out.println("<big>Hello World</big>");
		out.println("</body></html>");
		//Set the content length to the size of the buffer
		res.setContentLength(bytes.size());
		//Send the buffer
		bytes.writeTo(res.getOutputStream());
	}
}