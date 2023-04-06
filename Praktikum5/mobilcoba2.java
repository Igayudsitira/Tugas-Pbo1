/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author さんけつ少女
 */
public class mobilcoba2 
{
    public static void main(String[] args){
        mobil2 toyota = new mobil2("zenix", 180);
        toyota.kecepatan = 90;
        int max = toyota.getSpeed();
        
        System.out.print("mobil2 : " + toyota.getModel());
        System.out.println(" Mempunyai maxSpeed " + max);
        System.out.print("mobil2 " + toyota.getModel() + " Melaju dengan kecepatan" + toyota.kecepatan + "km\jam");
    }
    
}
