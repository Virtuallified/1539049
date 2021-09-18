<%@ page import="java.io.*,java.sql.*,java.util.*" %>
<html>
<head>
<title>Student Details</title>
</head>
<body>
<%
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from student");
				boolean more=rs.next();
				String dtl=rs.getString("Name")+"\t"
					+rs.getString("Roll")+"\t"
					+rs.getString("Subject")+"\t"
					+rs.getString("Course")+"\t"
					+rs.getString("Mobile")+"\t"
					+rs.getString("Year");
					
					
					/*select * from student;
					CREATE TABLE student(Name varchar2(50),Roll varchar2(50),Subject varchar2(50),Course varchar2(50),Mobile varchar2(50),Year varchar2(50));
					INSERT INTO student VALUES ('Pulok Mondol','1539048','Computer','MCA','9836522556','2013');
					DELETE FROM student WHERE roll='101';
					*/
%>
<%= dtl %>&emsp;
</body>
</html>