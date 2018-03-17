/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Xiao Weikun
 */
public class GuestList {
    private ArrayList<Guest> guestList;

    public GuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }
    
    
}
