/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader (isr);
    public static void main(String[] args) throws IOException {
        mainan mainan1 = new mainan("Bola", "Merah", "tidak ada batasan umur", 15000, 5, 1);
        while (true){
            System.out.print("""
                =======================================
                         SISTEM PENDATAAN MAINAN
                       DI TOKO MAINAN SUN THAI TEA
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                               MENU UTAMA 
                             
                            [1] Tambah Data
                            [2] Lihat Data
                            [3] Edit Data
                            [4] Hapus Data
                            [5] Exit
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);
            
        System.out.print ("Silahkan Pilih Menu Yang Tersedia : ");
        int pilih = Integer.parseInt(br.readLine());
        
        switch (pilih ){
            case 1 :
                mainan1.tambah_mainan();
                break;
            
            case 2 :
                mainan1.lihat_mainan();
                break;
                
            case 3 :
                mainan1.ubah_mainan();
                break;
                
            case 4 :
                mainan1.hapus_mainan();
                break;
                
            case 5 :
                System.exit(0);
                break;
                
            default :
                System.out.println("Pilihan yang anda masukkan tidak valid");
        }
        }
    }
    
}
