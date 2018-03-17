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
public class Host extends People{
    private boolean avaliablity;

    public Host(boolean avaliablity, String name, char gender, String phone) {
        super(name, gender, phone);
        this.avaliablity = avaliablity;
    }

    public boolean isAvaliable() {
        return avaliablity;
    }

    public void setAvaliablity(boolean avaliablity) {
        this.avaliablity = avaliablity;
    }

    @Override
    public String toString() {
        return "Host{" + super.toString() + "avaliablity=" + avaliablity + '}';
    }
    
    
}
