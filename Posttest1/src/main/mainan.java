/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class mainan {
    String nama_mainan, warna, keterangan;
    int harga, stok, kode;
    
    
    public mainan(String nama_mainan, String warna, String keterangan, int harga, int stok, int kode) {
        this.nama_mainan = nama_mainan;
        this.warna = warna;
        this.keterangan = keterangan;
        this.harga= harga;
        this.stok= stok;
        this.kode= kode;
    }
        
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    static ArrayList<mainan> mainan1 = new ArrayList<>();
    
    void tambah_mainan() throws IOException {
        System.out.println("========================================");
        System.out.println("               TAMBAH DATA              ");
        System.out.println("========================================");
        
        System.out.print("Nama Mainan : ");
        nama_mainan = br.readLine();
        
        System.out.println("........................................");
        System.out.print("Warna : ");
        warna = br.readLine();
        
        System.out.println("........................................");
        System.out.print("Keterangan : ");
        keterangan = br.readLine();
        
        System.out.println("........................................");
        System.out.print("Harga : ");
        harga = Integer.parseInt(br.readLine());
        
        System.out.println("........................................");
        System.out.print("Stok : ");
        stok = Integer.parseInt(br.readLine());
        
        System.out.println("........................................");
        System.out.print("Code mainan : ");
        kode = Integer.parseInt(br.readLine());
        
        
        System.out.print("""
                         ........................................
                            >>> DATA BERHASIL DITAMBAHKAN <<<   
                         """);
        
        mainan x = new mainan (nama_mainan, warna, keterangan, harga, stok, kode);
        x.nama_mainan = nama_mainan;
        x.warna = warna;
        x.keterangan = keterangan;
        x.harga = harga;
        x.stok = stok;
        x.kode = kode;
        mainan1.add(x);
        x.tambah_mainan();
}
    
    void lihat_mainan() throws IOException {
        if (mainan1.isEmpty()) {
            System.out.println("........................................");
            System.out.println("       !!! DATA BELUM TERISI !!!        ");
            return;
        }
        
        for(int i = 0 ; i < mainan1.size();i++){
                System.out.println(i+1);
                System.out.println("========================================");
                System.out.println("               LIHAT DATA              ");
                System.out.println("========================================");
                System.out.println("Nama Mainan    : " + mainan1.get(i).nama_mainan);
                System.out.println("Warna          : " + mainan1.get(i).warna);
                System.out.println("Keterangan     : " + mainan1.get(i).keterangan);
                System.out.println("Harga          : " + mainan1.get(i).harga);
                System.out.println("Stok           : " + mainan1.get(i).stok);
                System.out.println("Kode           : " + mainan1.get(i).kode);
        }
    }
    
    void ubah_mainan() throws IOException {
        InputStreamReader tambah = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader (tambah);
        lihat_mainan();
        int index;
        System.out.println("===========================================");
        System.out.println("                UBAH DATA                  ");
        System.out.println("===========================================");
        System.out.println("Silahkan pilih nomor data  yang ingin di ubah : ");
        index = Integer.parseInt(input.readLine());
        index--;
        
        System.out.println("........................................");
        System.out.println("Masukkan nama mainan : ");
        nama_mainan = input.readLine();
        System.out.println("Masukkan warna mainan : ");
        warna = input.readLine();
        System.out.println("Masukkan keterangan : ");
        keterangan = input.readLine();
        System.out.println("Masukkan harga mainan : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukkan stok  : ");
        stok = Integer.parseInt(input.readLine());
        System.out.println("Masukkan kode mainan : ");
        kode = Integer.parseInt(input.readLine());
        
        mainan1.get(index).nama_mainan = nama_mainan;
        mainan1.get(index).warna = warna;
        mainan1.get(index).keterangan = keterangan;
        mainan1.get(index).harga = harga;
        mainan1.get(index).stok = stok;
        mainan1.get(index).kode = kode;
        
        System.out.print("""
                         ........................................
                              >>> DATA BERHASIL DIUBAH <<<   
                         """);
    }
    
    void hapus_mainan() throws IOException{
        lihat_mainan();
        InputStreamReader tambah = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader (tambah);
        int A;
        
        System.out.println("===========================================");
        System.out.println("                HAPUS DATA                  ");
        System.out.println("===========================================");
        System.out.println("Masukan Index Data Yang Ingin Dihapus : ");
        A = Integer.parseInt(input.readLine());
        A--;
        mainan1.get(A).hapus_mainan();
        mainan1.remove(A);
        
        System.out.print("""
                         ........................................
                              >>> DATA BERHASIL DIHAPUS <<<   
                         """);
    }
}
