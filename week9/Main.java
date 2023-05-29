/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;
import java.util.Scanner;
/**
 *
 * @author D2J-00
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kondisi Hp      : ");
        int status = input.nextInt();
        HPLG hp = new HPLG();
        hp.powerOn();
        hp.powerOff();
        hp.volumeUp();
        hp.getNama();
        hp.setNama();
        hp.getNomor();
        hp.setNomor();
    }
    
}
