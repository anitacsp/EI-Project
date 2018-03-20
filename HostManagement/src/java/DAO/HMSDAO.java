/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jorden
 */
public class HMSDAO {

    private static Connection conn = null;
    private static PreparedStatement stmt = null;
    private static ResultSet results = null;

   
    public static ArrayList<ArrayList<String>> getRequests() {
        
        ArrayList<ArrayList<String>> totalRequests = new ArrayList<>();
        try {
            conn = ConnectionManager.getConnection();
            
            if(conn==null) {
                return totalRequests;
            }
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
            stmt = conn.prepareStatement("select * from request");
            results = stmt.executeQuery();
            
            
            while (results.next()) {
                String hostName = results.getString(1);//get all the columns needed
                String hostAge = results.getString(2);
                String hostGender = results.getString(3);
                String hostRace = results.getString(4);
                String cost = results.getString(5);
                String tableNo = results.getString(6);
                String startDateTime = results.getString(7);
                String endDateTime = results.getString(8);
                String requesterName = results.getString(9);
                String requestNo = results.getString(10);
                ArrayList<String> newRequest = new ArrayList<>();
                newRequest.add(hostName);
                newRequest.add(hostAge);
                newRequest.add(hostGender);
                newRequest.add(hostRace);
                newRequest.add(cost);
                newRequest.add(tableNo);
                newRequest.add(startDateTime);
                newRequest.add(endDateTime);
                newRequest.add(requesterName);
                newRequest.add(requestNo);
                totalRequests.add(newRequest);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, results);
        }
        System.out.println("total: " + totalRequests);
        return totalRequests;
    }
    public static  ArrayList<ArrayList<String>> getUserRequests(String user){
    ArrayList<ArrayList<String>> totalUserRequests = new ArrayList<>();
        
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from booking where hostName = ?");
            stmt.setString(1, user);
            results = stmt.executeQuery();
            while (results.next()) {
                String hostName = results.getString(1);//get all the columns needed
                String tableNo = results.getString(2);
                String startDateTime = results.getString(3);
                String endDateTime = results.getString(4);
                String requesterName = results.getString(5);
                ArrayList<String> newRequest = new ArrayList<>();
                newRequest.add(hostName);
                newRequest.add(tableNo);
                newRequest.add(startDateTime);
                newRequest.add(endDateTime);
                newRequest.add(requesterName);
                totalUserRequests.add(newRequest);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, results);
        }
        System.out.println("total: " + totalUserRequests);
        return totalUserRequests;
    }
    
    public static ArrayList<String> getRequestNo(String requestNo){
        ArrayList<String> details = new ArrayList<String>();
         try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("select * from request where requestId = ?");
            stmt.setString(1, requestNo);
            results = stmt.executeQuery();
             while (results.next()) {
                String tableNo = results.getString(6);
                String startDateTime = results.getString(7);
                String endDateTime = results.getString(8);
                String requesterName = results.getString(9);
                details.add(tableNo);
                details.add(startDateTime);
                details.add(endDateTime);
                details.add(requesterName);
                System.out.println("here si " + details);
             }
         }
         catch (Exception e) {
                e.printStackTrace();
            }
         return details;
    }
    public static void insert(String user, ArrayList<String> details) throws SQLException {
            System.out.println("User is " + user + ", details are "+ details);
            String tableNo = details.get(0);
            String startDateTime = details.get(1);
            String endDateTime = details.get(2);
            String requesterName = details.get(3);
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("insert into booking values (?, ?, ?, ?, ?)");
            stmt.setString(1, user);
            stmt.setString(2, tableNo);
            stmt.setString(3, startDateTime);
            stmt.setString(4, endDateTime);
            stmt.setString(5, requesterName);
            stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, results);
        }
    }
    public static void delete(String requestNo){
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.prepareStatement("delete from request where requestId = "+ requestNo);
            stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, stmt, results);
        }
    }
}
