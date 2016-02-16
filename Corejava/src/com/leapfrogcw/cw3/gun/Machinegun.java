/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrogcw.cw3.gun;

/**
 *
 * @author Prakriti
 */
public class Machinegun extends Gun {
    public Machinegun(Bullet bullet){
         this.bullet=bullet;
    }
    @Override
    public void shoot(){
        System.out.println(bullet.size()+ "  of machinegun is shooting");
        
    }
    
}
