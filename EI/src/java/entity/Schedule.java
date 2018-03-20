/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Xiao Weikun
 */
public class Schedule {
    private String guestName;
    private String startDatetime;
    private String endStartDate;
    private int tableNo;

    public Schedule(String guestName, String startDatetime, String endStartDate, int tableNo) {
        this.guestName = guestName;
        this.startDatetime = startDatetime;
        this.endStartDate = endStartDate;
        this.tableNo = tableNo;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getEndStartDate() {
        return endStartDate;
    }

    public void setEndStartDate(String endStartDate) {
        this.endStartDate = endStartDate;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    

}