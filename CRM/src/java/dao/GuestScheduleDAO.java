/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.GuestScheduling;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Meredith
 */
public class GuestScheduleDAO {

    private static Connection conn = null;
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;

    public static int getGuestTable(String guestname) {
        int tableno = 0;
        try {
            conn = ConnectionManager.getConnection();
            if (conn == null) {
                return 0;
            }

            stmt = conn.prepareStatement("select tableno from schedule where guest = ?");
            stmt.setString(1, guestname);

            rs = stmt.executeQuery();

            if (rs.next()) {
                tableno = rs.getInt("tableno");
            } else {
                return 0;
            }

        } catch (SQLException e) {
            return 0;
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return tableno;
    }

    public static ArrayList<GuestScheduling> getGuestSchedules() {

        ArrayList<GuestScheduling> guestSchedules = new ArrayList<>();
        try {
            conn = ConnectionManager.getConnection();
            if (conn == null) {
                return guestSchedules;
            }

            stmt = conn.prepareStatement("select * from schedule");

            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("guest"));
                guestSchedules.add(new GuestScheduling(rs.getString("guest"), rs.getInt("tableno"), rs.getInt("vodka"),
                        rs.getInt("wine"), rs.getInt("beer"), rs.getDouble("paymentAmt"), rs.getInt("paid"), rs.getDate("timestart"), rs.getDate("timeend"),
                        rs.getString("hostname")));
            }
            
            System.out.println(guestSchedules);

        } catch (SQLException e) {
            return guestSchedules;
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return guestSchedules;
    }

}
