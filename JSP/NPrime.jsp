<html>
<head>
<title>NPrime</title>
</head>
<body>
<h1>The Prime No.s are below : </h1>
<%
	int n = Integer.parseInt(request.getParameter("num"));
	int p;
	for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				out.println(i);
		}
%>
</body>
</html>