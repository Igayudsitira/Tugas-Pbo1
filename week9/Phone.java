/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week9;

/**
 *
 * @author D2J-00
 */
public interface Phone {
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getvolume();
    void getNama();
    void setNama();
    void getNomor();
    void setNomor();
    
    
}

