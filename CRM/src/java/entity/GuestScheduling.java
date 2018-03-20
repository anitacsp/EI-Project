/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Meredith
 */
public class GuestScheduling {
    private String guest;
    private int tableno;
    private int vodka;
    private int wine;
    private int beer;
    private double paymentamt;
    //paid - 0 is No, 1 is Yes
    private boolean paidbool;
    private Date starttime;
    private Date endtime;
    private String hostname;
    
    public GuestScheduling(String guest, int tableno, int vodka, int wine, int beer, double paymentamt, int paid, Date starttime, Date endtime, String hostname) {
        this.guest = guest;
        this.tableno = tableno;
        this.vodka = vodka;
        this.wine = wine;
        this.beer = beer;
        this.paymentamt = paymentamt;
        if(paid==0) {
            this.paidbool = false;
        } else {
            this.paidbool = true;
        }
        this.starttime = starttime;
        this.endtime = endtime;
        this.hostname = hostname;
    }
    
    public String getGuest() {
        return guest;
    }
    
    public int getTableNo() {
        return tableno;
    }
    
    public int getVodka() {
        return vodka;
    }
    
    public int getWine() {
        return wine;
    }
    
    public int getBeer() {
        return beer;
    }
    
    public double getPaymentAmt() {
        return paymentamt;
    }
    
    public boolean hasPaid() {
        return paidbool;
    }
    
    public Date getStartTime() {
        return starttime;
    }
    
    public Date getEndTime() {
        return endtime;
    }
    
    public String getHostName() {
        return hostname;
    }
    
}
