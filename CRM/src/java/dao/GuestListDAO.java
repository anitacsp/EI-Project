/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Meredith
 */
public class GuestListDAO {

    private static Connection conn = null;
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;

    public static void addGuestList(String guest, ArrayList<String> guestlist) {
        try {
            conn = ConnectionManager.getConnection();
            if (conn == null) {
                return;
            }

            for (String guestlister : guestlist) {
                stmt = conn.prepareStatement("insert into guestlist values (?, ?)");
                stmt.setString(1, guest);
                stmt.setString(2, guestlister);
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            return;
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
    }

    public static String findGuestTable(String hostname, String guestname) {
        String msg = "";
        System.out.println("In find guest table");
        try {
            conn = ConnectionManager.getConnection();
            if (conn == null) {
                return msg;
            }
            stmt = conn.prepareStatement("select guestlister from guestlist where guest = ?");
            stmt.setString(1, hostname);
            rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Got in!");
                if (rs.getString("guestlister").equals(guestname)) {
                    int tableno = GuestScheduleDAO.getGuestTable(hostname);
                    if (tableno == 0) {
                        msg = "Error: Cannot find table";
                    } else {
                        msg = "Successfully found guest! Please go to Table " + tableno;
                        stmt = conn.prepareStatement("delete from guestlist where guest = ? and guestlister = ?");
                        stmt.setString(1, hostname);
                        stmt.setString(2, guestname);
                        stmt.executeUpdate();
                    }

                } else {
                    msg = "Error: Invalid Guest/Host";
                }
            }

        } catch (SQLException e) {
            return msg;
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
        return msg;
    }

}
