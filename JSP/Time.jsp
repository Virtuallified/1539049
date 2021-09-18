<HTML>
<BODY>
Type one : new java.util.Date()<br>
Hello! The time is now <%= new java.util.Date() %><br><br>

Type two : java.util.Date date = new java.util.Date( )<br>
		  &emsp;&emsp;&emsp;&emsp;&ensp;String.valueOf(date)<br>
<% java.util.Date date = new java.util.Date( );
   out.println(String.valueOf(date)); %>

</HTML>
</BODY>