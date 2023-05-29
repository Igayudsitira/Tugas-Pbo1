/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author D2J-00
 */
public class HPLG implements Phone {
    private int volume;
    private int status;
    public HPLG() {
        this.volume = 100;
    }
    
    @Override
    public void powerOn() {
        this.status = 1;
        System.out.println("Handphone ON");
    }
    
    @Override
    public void powerOff(){
        this.status = 0;
        System.out.println("Handphone OFF");
    }
    
    @Override
    public void volumeUp() {
        if(this.status == 0){
            System.out.println("Handphone OFF. Tidak bisa volumeUp");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }
    
    @Override
    public void volumeDown() {
        if(this.status == 0){
            System.out.println("Handphone OFF. Tidak bisa volumeDown");
        }
        else
        {
            this.volume--;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    @Override
    public int getvolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getNomor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setNomor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    