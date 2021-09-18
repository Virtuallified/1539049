import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionTrackerHitCount extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		//Get the current session object, create one if necessary
		HttpSession session = req.getSession(true);
		//Increment the hit count for this page. The value is saved in this client's session under the name "tracker_count"
		Integer count = (Integer)Session.getValue("tracker_count");
		if (count == null)
			count = new Integer(1);
		else
			count = new Integer(count.intValue()+1:
		session.putValue("tracker_count",count);
		out.println("<HTML><HEAD><TITLE>SessionTracker</TITLE></HEAD>");
		out.println("<BODY><H1>Session Tracking Demo</H1>");
		//Display the hit count for this page
		out.println("You'have visited this page"+count+((count.intValue()==1)?"time":"times"));
		out.println("<P>");
		out.println("<H1>Here is your session data : </H1>");
		String[] names= session.getValueNames();
		for(int i=0;i<names.length;i++)
		{
			out.println(name[i]+":"+session.getValue(names[i])+"<BR>");
		}
		out.println("</BODY></HTML>");
	}
}
			
