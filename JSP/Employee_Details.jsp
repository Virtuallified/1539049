<%@ page import="java.io.*,java.sql.*,java.util.*" %>
<html>
<head>
<title>Employee Details</title>
</head>
<body>
<%
	String dtl=request.getParameter("val");
		
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from employees where EMPLOYEE_ID='"+dtl+"'");
				String rslt=null;
				while(rs.next())
				{	
					out.println("<table border='1' style='width:80%' align='center'><tr>");
					for(int i=1;i<=10;i++)
					{
						dtl = rs.getString(i);
						out.println("<td>"+dtl+"</td><br>");
					}
					out.println("</tr></table>");
				}
%>
</body>
</html>