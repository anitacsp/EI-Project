<%-- 
    Document   : login
    Created on : 17 Mar, 2018, 3:53:27 PM
    Author     : Xiao Weikun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Club Penguin</title>
    </head>
    <body>
        <h1>Welcome To Club Penguin!</h1>
        
        <form action="LoginServlet" method="post">
            <input type="text" name="username" placeholder="Username" required /><br />
            <input type="password" name="password" placeholder="Password" required /><br />

            <button type="submit" name="login" > Login</button>
        </form>
        
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
                out.println("<p style='color:red'>" + error + "</p>");
            }
        %>
    </body>
</html>
