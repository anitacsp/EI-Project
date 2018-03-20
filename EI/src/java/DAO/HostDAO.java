/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Host;

/**
 *
 * @author Xiao Weikun
 */
public class HostDAO {
    public Host searchHost(){
        return new Host(true, "name", 'M', "11111", 10.0);
    }
}
