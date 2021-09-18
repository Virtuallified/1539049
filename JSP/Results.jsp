<html>
<head>
<title>Results</title>
</head>
<body>
<%
		double v1=Integer.parseInt(request.getParameter("one"));
		double v2=Integer.parseInt(request.getParameter("two"));
		char op=request.getParameter("opr").charAt(0);
		double output=0;
		if (op=='+')
			output=v1+v2;
		else if (op=='-')
			output=v1-v2;
		else if (op=='*')
			output=v1*v2;
		else if (op=='/')
			output=v1/v2;
%>
<h1>Total =<%= output %></h1>
</body>
</html>