/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrogcw.cw3.gun.entity;
import com.leapfrogcw.cw3.gun.Gun;
import com.leapfrogcw.cw3.gun.Machinegun;
import com.leapfrogcw.cw3.gun.Medium;
import com.leapfrogcw.cw3.gun.Rifle;
import com.leapfrogcw.cw3.gun.Smallsize;
import com.leapfrogcw.cw3.gun.Standard;
/**
 *
 * @author Prakriti
 */
public class Program {
     
    public static void main(String[] args){
        Gun p=new Machinegun(new Standard());
        p.shoot();
        p.setsize(new Medium());
        p.shoot();
        p.setsize(new Smallsize());
        p.shoot();
    }
}
