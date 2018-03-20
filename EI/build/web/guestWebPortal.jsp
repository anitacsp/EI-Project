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
        <script type="text/javascript">
            function hide() {
                document.getElementById('hostInfo').style.display = 'none';
                
            };
            function show() {
                document.getElementById('hostInfo').style.display = 'block';
            };
            function checkHostDetail() {
                var name = document.getElementById('name');
                var age = document.getElementById('age');
                var gender = document.getElementById('gender');
                var race = document.getElementById('race');
                var cost = document.getElementById('cost');
                
                if(name.value == ""){
                    document.getElementById('name').value = "*";
                }
                
                if(age.value == ""){
                    document.getElementById('age').value = "*";
                }
                
                if(gender.value == ""){
                    document.getElementById('gender').value = "*";
                }
                
                if(race.value == ""){
                    document.getElementById('race').value = "*";
                }
                
                if(cost.value == ""){
                    document.getElementById('cost').value = "*";
                }
            };
        </script>

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
            <br/>
            Premium Beer ($8):
            <select name="beer" required>
                <option value="0">0</option>
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
            
            Premium Volka ($20):
            <select name="volka" required>
                <option value="0">0</option>
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
            
            Premium Wine ($50):
            <select name="wine" required>
                <option value="0">0</option>
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
            <br/>
            
            Start Date time:
            <input type="datetime-local" name="startDatetime" required>

            End Date time:
            <input type="datetime-local" name="endDatetime" required>
            <br/>
            <br/>
            
            Do you want to book a host?
            <input type="radio" name="option" value="no" onclick="hide()" checked> no
            <input type="radio" name="option" value="yes" onclick="show()" > yes
            <br>
            <br>
            
            <div id="hostInfo" style="display: none;">
                Host Preference:
                <br/>
                <br/>
                Name:
                <input type="text" name="hostName" id="name" value="">

                Age:
                <input type="text" name="hostAge" id="age" value="">
                <br/>

                Gender:
                <input type="text" name="hostGender" id="gender" value="">

                Race:
                <input type="text" name="hostRace" placeholder="E.g Chinese, Malay, Indian...etc" id="race" value="">

                Cost:
                <input type="text" name="hostCost" id="cost" value="">
                <br/>
                <br/>
            </div>

            <button type="submit" onclick="checkHostDetail()">Submit</button>


        </form>
    </body>
</html>
