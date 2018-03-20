/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import db.DatabaseConnection;
import entity.Host;
import entity.Schedule;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Xiao Weikun
 */
public class ScheduleDAO {
    public int addSchedule(Schedule s, Host h) {
        int updateQuery = 0;
        try {
            DatabaseConnection db = new DatabaseConnection();
            Connection conn = db.getConn();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO schedule VALUES (?,?,?,?,?)");
            
            stmt.setString(1, s.getGuestName());
            stmt.setString(2, s.getStartDatetime());
            stmt.setString(3, s.getEndStartDate());
            stmt.setInt(4, s.getTableNo());
            stmt.setString(5, h.getName());

            updateQuery = stmt.executeUpdate();

            db.closeConn();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return updateQuery;

    }
}
