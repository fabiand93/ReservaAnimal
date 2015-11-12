<html>
  <body>
    Hello! The time now is <%= new java.util.Date() %>
    <ul><li>The port on which the request was received is <%=request.getLocalPort() %>.
    </li>
    <li>Is this a new session? <%=session.isNew() %></li>
    <li>The output object is an instance of the <%=out.getClass() %></li>
    <li>The buffer size of the output is: <%=out.getBufferSize() %></li></ul>
    <body>
hello! The time is now <%= new java.util.Date() %>
<ul>
<li> The port on wich request was received id <%=request.getLocalPort() %>.
<li> The type of the response  is <%=session.isNew() %> </ul>
<%double rnd = Math.random(); %>
    <%out.println("A random  number  between [0,1) was generated :"+rnd+",<br><br>"); %>
    <%if(rnd<0.5){%>
    of course ,it is <i> less than </i>0.5
    <%} else { %>
    of,course <i>is greater </i>
    <%} %>
    <%!private int visitCounter=0; %>
    <%! public synchronized void incrementVisitCounter(){
    	this.visitCounter++;}
    	%>
    <%!public int getVisitCounter(){
    	return this.visitCounter;
    }
    %>
    }
  </body>
  <html>
