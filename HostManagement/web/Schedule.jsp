<%-- 
    Document   : hostManagement
    Created on : 17 Mar, 2018, 6:31:26 PM
    Author     : Jorden
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Host Management Portal</title>
    </head>
    <body>
        <h1>Existing Requests</h1>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
        <table>
            <%
                out.println("<tr> <td>Host Name</td> <td>Age</td> <td>Gender</td> <td>Race</td> <td>Rate/hr</td> <td>Table Number</td> <td>Starting Time</td><td>Ending Time</td> <td>Requester Name</td> <td>Request Number </td> </tr>");
                ArrayList<ArrayList<String>> allRequests = (ArrayList<ArrayList<String>>)session.getAttribute("requests");
                System.out.println(allRequests);
                for (ArrayList<String> newRequest:allRequests){
                    out.println("<tr>");
                    for (int i = 0;i<newRequest.size();i++){
                        out.println("<td>");
                        out.println(newRequest.get(i));
                        out.println("</td>");
                    }
                    out.println("</tr>");
                }
            %>
        </table>
        <h1>Current Schedule</h1>
         <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
        <table>
            <%
                        String errors = (String) session.getAttribute("errors");
                        System.out.println("error is " + errors);
                        if (errors != null) {
                            out.println("<font color = 'red' size = \"+2\"><ul>");
                            out.println(errors);
                            out.println("</ul></font>");
                        }
                    %>
            <%
                out.println("<tr> <td>Host Name</td> <td>Table Number</td> <td>Starting Time</td> <td>Ending Time</td> <td>Requester Name</td> </tr>");
                try{
                    ArrayList<ArrayList<String>> allUserRequests = (ArrayList<ArrayList<String>>)session.getAttribute("userRequests");
                    System.out.println("all blue " + allUserRequests);
                    for (ArrayList<String> newUserRequest:allUserRequests){
                        out.println("<tr>");
                        for (int i = 0;i<newUserRequest.size();i++){
                            out.println("<td>");
                            out.println(newUserRequest.get(i));
                            out.println("</td>");
                        }
                        out.println("</tr>");
                    }
                }
                catch(Exception e){
                    out.println("No existing appointments");
                }
            %>
        </table>
        <h1>
            Chope a Schedule
        </h1>
        Please pick your schedule
        <form action="ChopeServlet" method="post">
            <input type="text" name="sched" placeholder="Request Number:" ><br/>
            <button type="submit" >Chope</button>
        </form>
        <br/>
    </body>
</html>
