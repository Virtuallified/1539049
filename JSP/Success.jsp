<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<html>
<head>
<title>Success</title>
</head>
<body>
<%
	String nm=request.getParameter("name");
	String rl=request.getParameter("roll");
	String sb=request.getParameter("sub");
	String cr=request.getParameter("cour");
	String mb=request.getParameter("mob");
	String yr=request.getParameter("year");
	session.setAttribute("Roll", rl);
		try
		{
			int x;
		
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				Statement st=con.createStatement();
				x=st.executeUpdate("INSERT INTO student VALUES ('"+nm+"','"+rl+"','"+sb+"','"+cr+"','"+mb+"','"+yr+"')");
		}
		catch (Exception e)
		{
			out.println("Error sql "+e);
		}
%>
<br>Successfully Submitted!	
<form action=/jsp/StudentDetails.jsp method=POST>
<input type=submit value='Show Details'>
</form>
</body>
</html>





<%
	/*
	First make table in oracle database with below codes
	select * from student;
	CREATE TABLE student(Name varchar2(50),Roll varchar2(50),Subject varchar2(50),Course varchar2(50),Mobile varchar2(50),Year varchar2(50));
	INSERT INTO student VALUES ('Pulok Mondol','1539048','Computer','MCA','9836522556','2013');
	DELETE FROM student WHERE roll='101';
	*/
%>