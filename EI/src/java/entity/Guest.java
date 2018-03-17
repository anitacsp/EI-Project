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
public class Guest extends People{

    public Guest(String name, char gender, String phone) {
        super(name, gender, phone);
    }

    @Override
    public String toString() {
        return "Guest{" + super.toString() + "}";
    }
    
}
