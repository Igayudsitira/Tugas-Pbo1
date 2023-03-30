/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai1;

import java.util.Scanner;

public class Nilai1 
{

       public static String NIM, namaMhs;
       public static double Nilai, Tugas, Total;
       public static char NilaiH;
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Masukkan NIM Anda  : ");
       NIM = scan.nextLine();
       System.out.print("Masukkan nama Anda : ");
       namaMhs = scan.nextLine();
       System.out.print("Masukkan nilai Anda : ");
       Nilai = scan.nextDouble();
       System.out.print("Masukkan nilai Tugas Anda : ");
       Tugas = scan.nextDouble();

       Total=(Nilai+Tugas)/2;
       if(Total>=85){
           NilaiH = 'A';
        }
        else if(Total>=60){
           NilaiH = 'B';
        }
        else{
            NilaiH = 'C';
        }
       System.out.println("Nilai : "+NilaiH);
    }

}
