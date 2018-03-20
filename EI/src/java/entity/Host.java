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
    private double cost;

    public Host(boolean avaliablity, String name, char gender, String phone, double cost) {
        super(name, gender, phone);
        this.avaliablity = avaliablity;
        this.cost = cost;
    }

    public boolean isAvaliable() {
        return avaliablity;
    }

    public void setAvaliablity(boolean avaliablity) {
        this.avaliablity = avaliablity;
    }
    
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    
    @Override
    public String toString() {
        return "Host{" + super.toString() + "avaliablity=" + avaliablity + '}';
    }
    
    
}
