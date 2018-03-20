<%-- 
    Document   : index
    Created on : 20 Mar, 2018, 6:54:32 PM
    Author     : Meredith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GuestLister</title>
    </head>
    <body>
        <h1>GuestList Checker </h1> <br> 
        
        <form action="FindGuestTable" method="post">
            Table Host: <input type="text" name="guest"> <br>
            Guest Name: <input type="text" name="guestlister"> <br>
            <input type="submit">          
            
        </form>
        
        <%
            String table = (String) request.getAttribute("table");
            if(table!=null){
                out.println(table);
            }
        %> <br><br>
        
        <a href="guestschedule.jsp"> View All Guests Schedules </a> <br> <br>
        View Guest's GuestList
    </body>
</html>
