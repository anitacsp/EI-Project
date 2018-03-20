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
            <select name="tableNum">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
            </select>
            
            <br/>
            Liquor:
            <input type="text" name="liquor" placeholder="E.g Volka" required>
            <br/>

            Start Date time:
            <input type="datetime-local" name="startDatetime" required>

            End Date time:
            <input type="datetime-local" name="startDatetime" required>
            <br/>

            Host Preference:
            <br/>

            Name:
            <input type="text" name="hostName" required>

            Age:
            <input type="text" name="hostAge" required>
            <br/>

            Gender:
            <input type="text" name="hostGender" required>

            Race:
            <input type="text" name="hostRace" placeholder="E.g Chinese, Malay, Indian...etc" required>

            Cost:
            <input type="text" name="hostCost" required>
            <br/>


            <button type="submit">Submit</button>


        </form>
    </body>
</html>
