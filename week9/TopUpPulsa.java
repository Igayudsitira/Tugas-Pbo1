/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author さんけつ少女
 */
public class TopUpPulsa {
 private double saldo;

    public TopUpPulsa(double saldoAwal) {
        saldo = saldoAwal;
    }

    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top up berhasil. Saldo Anda sekarang: " + saldo);
    }

    public void cekSaldo() {
        System.out.println("Saldo Anda saat ini: " + saldo);
    }

    public static void main(String[] args) {
        TopUpPulsa topUpPulsa = new TopUpPulsa(40000); 
        topUpPulsa.cekSaldo(); 

        topUpPulsa.topUp(30000); 
        topUpPulsa.topUp(40000); 

        topUpPulsa.cekSaldo(); 
    }
}
