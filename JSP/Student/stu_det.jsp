<%@ page import="java.io.*,java.sql.*,java.util.*" %>
<html>
<head>
<title>Student Details</title>
</head>
<body>
<table style='width:100%' ><tr><td>
<%
			String dtl=request.getParameter("roll");
			String temp=null;
			
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				Statement st=con.createStatement();
				ResultSet rs1=st.executeQuery("select * from students where roll='"+dtl+"'");
				String rslt=null;
				while(rs1.next())
				{	
					out.println("<table border='1' style='width:98%' align='Center'>");
					out.println("<tr><td>Student</td></tr>");
					for(int i=1;i<=3;i++)
					{
						rslt = rs1.getString(i);
						out.println("<td>"+rslt+"</td>");
					}
					out.println("</tr></table>");
				}
%>&emsp;</td><td>		
<%
				ResultSet rs2=st.executeQuery("select * from course where roll='"+dtl+"'");
				while(rs2.next())
				{	
					out.println("<table border='1' style='width:98%' align='Center'>");
					out.println("<tr><td>Course</td></tr>");
					for(int i=1;i<=5;i++)
					{
						rslt = rs2.getString(i);
						out.println("<td>"+rslt+"</td>");
					}
					out.println("</tr></table>");
				}
%>&emsp;</td><td>
<%
				ResultSet rs_spcl=st.executeQuery("select Dept_id from students where roll='"+dtl+"'");
				while(rs_spcl.next())
				{
					temp=rs_spcl.getString("Dept_id");
				}
				ResultSet rs3=st.executeQuery("select * from department where Dept_id='"+temp+"'");
				while(rs3.next())
				{	
					out.println("<table border='1' style='width:98%' align='Center'>");
					out.println("<tr><td>Department</td></tr>");
					for(int i=1;i<=2;i++)
					{
						rslt = rs3.getString(i);
						out.println("<td>"+rslt+"</td>");
					}
					out.println("</tr></table>");
				}				
%>&emsp;</td></tr></table>
</body>
</html>