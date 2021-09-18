<%@ page import="java.io.*,java.sql.*,java.util.*" %>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
<%  
	int roll=Integer.parseInt(request.getParameter("roll"));
	String name=request.getParameter("name");
	String did=request.getParameter("d_id");
	String cid=request.getParameter("c_id");
	String title=request.getParameter("title");
	String totcrd=request.getParameter("tot_cred");
	String grd=request.getParameter("grade");
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        try
			{    
				Statement st = con.createStatement() ;
				ResultSet rs1 = st.executeQuery("insert into students values('"+roll+"','"+name+"','"+did+"')");
				ResultSet rs2 = st.executeQuery("insert into course values('"+roll+"','"+cid+"','"+title+"','"+totcrd+"','"+grd+"')");
				out.println("<h2>Added Successful!!!</h2>");
			}
		catch(SQLException e)
		{
			out.println(e);
			
		}
			
%>

</body>
</html>