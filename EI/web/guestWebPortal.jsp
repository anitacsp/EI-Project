<%-- 
    Document   : guestWebPortal
    Created on : 17 Mar, 2018, 3:03:26 PM
    Author     : Xiao Weikun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guest Web Portal</title>
    </head>
    <body>
        <h1>Booking table</h1>
        <br/>
        <form action="BookingServlet" method="post">
            
            Table Number:
            <input type="text" placeholder="E.g 1 ~ 10">
            <br/>
            
            Liquor:
            <input type="text" placeholder="E.g Volka">
            <br/>
            
            Date and Time:
            <input type="datetime-local">
            <br/>
            
            Host Preference:
            <input type="text" placeholder="E.g Gender, Age... etc">
            <br/>
            
            <button type="submit">Submit</button>
            
            
        </form>
    </body>
</html>
