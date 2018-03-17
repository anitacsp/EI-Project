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
public class Event {
    private String name;
    private int tableNumber;
    private String datetime;

    public Event(String name, int tableNumber) {
        this.name = name;
        this.tableNumber = tableNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", tableNumber=" + tableNumber + ", datetime=" + datetime + '}';
    }
    
    
    
}
