<%-- 
    Document   : guestschedule
    Created on : 20 Mar, 2018, 9:05:47 PM
    Author     : Meredith
--%>

<%@page import="entity.GuestScheduling"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.GuestScheduleDAO"%>
<%@page import="dao.GuestScheduleDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guest Schedule</title>
    </head>
    <body>
        <h1>Guest Schedule</h1> <br>
        <%
            ArrayList<GuestScheduling> allGuests = GuestScheduleDAO.getGuestSchedules();

        %>

        <table border='1'>
            <tr>
                <td>Guest Name</td> <td>Table Number</td> <td>Vodka Qty</td> <td>Wine Qty</td> <td>Beer Qty</td> <td>Payment Amount</td> 
                <td>Paid?</td> <td>Booking StartTime</td> <td>Booking EndTime</td> <td>Host Name</td></tr>

            <%                    
                for (GuestScheduling guests : allGuests) {
                    out.println("<tr><td>" + guests.getGuest() + "</td><td>" + guests.getTableNo() + "</td><td>" + guests.getVodka()
                            + "</td><td>" + guests.getWine() + "</td><td>" + guests.getBeer() + "</td><td>$" + guests.getPaymentAmt() + "</td><td>"
                            + guests.hasPaid() + "</td><td>" + guests.getStartTime() + "</td><td>" + guests.getEndTime() + "</td><td>"
                            + guests.getHostName() + "</td></tr>");

                }
            %>
        

    </table>
</body>
</html>
