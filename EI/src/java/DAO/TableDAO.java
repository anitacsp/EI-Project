/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import db.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Xiao Weikun
 */
public class TableDAO {
    public boolean isTableBooked(int tableNo, String startDatetime, String endDatetime) {
        
        DatabaseConnection db = new DatabaseConnection();
        Connection conn = db.getConn();
        boolean result = false;
        
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from schedule where tableNo = ? AND (startDateTime > ? OR endDateTime < ?)");
            stmt.setInt(1, tableNo);
            stmt.setString(2, startDatetime);
            stmt.setString(3, endDatetime);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                result = true;
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        db.closeConn();
        return result;
        
        
    }
}
