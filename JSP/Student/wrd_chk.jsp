<%@ page import="java.io.*,java.sql.*,java.util.*" %>
<html>
<head>
<title>Results - Course Title</title>
</head>
<body>
<%  
	String wrd=request.getParameter("word");
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			try
				{    
					Statement st = con.createStatement() ;
					ResultSet rs = st.executeQuery("SELECT * FROM course WHERE Cor_Title LIKE '%"+wrd+"%'");
					String rslt=null;
					while(rs.next())
					{	
						out.println("<table border='1' style='width:50%' align='center'>");
						out.println("<tr><td><h4>Results</h4></td></tr>");
						for(int i=1;i<=3;i++)
						{
							rslt = rs.getString(i);
							out.println("<td>"+rslt+"</td>");
						}
						out.println("</tr></table>");
					}
				}
			catch(SQLException e)
				{
					out.println(e);
				}
%>
</body>
</html>