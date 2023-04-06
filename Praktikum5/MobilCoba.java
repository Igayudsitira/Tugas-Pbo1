package com.mycompany.praktikum5;

public class MobilCoba 
{
    public static void main(String[] args)
    {
        Mobil toyota01 = new Mobil();
        
        toyota01.setModel("Avanza");
        toyota01.setSpeed(120);
        
        System.out.print("Latihan05a : " + toyota01.getModel());
        System.out.print(" mempunyai maxSpeed " + toyota01.getSpeed() );
        System.out.println(" km per jam\n");
    }
    
}
