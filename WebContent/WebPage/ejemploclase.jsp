<html>
  <body>
    Hello! The time now is <%= new java.util.Date() %>
    <ul><li>The port on which the request was received is <%=request.getLocalPort() %>.
    </li>
    <li>Is this a new session? <%=session.isNew() %></li>
    <li>The output object is an instance of the <%=out.getClass() %></li>
    <li>The buffer size of the output is: <%=out.getBufferSize() %></li></ul>
    
    }
  </body>
  <html>
