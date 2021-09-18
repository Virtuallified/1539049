<html>
<head>
<title>NFibonacci Series</title>
</head>
<body>
<h1>The Fibonacci No.s are below : </h1>
<%
	int n = Integer.parseInt(request.getParameter("num"));
	int f1, f2=0, f3=1;
	for(int i=1;i<=n;i++)
		{
			out.print(" "+f3+" ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
%>
</body>
</html>