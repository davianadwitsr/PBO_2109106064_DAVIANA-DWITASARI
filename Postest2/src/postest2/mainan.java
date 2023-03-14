/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class mainan {
    private String nama_mainan; 
    private String warna; 
    private String keterangan;
    private int harga;
    private int stok;
    private int kode;
    
    
    public mainan(String nama_mainan, String warna, String keterangan, int harga, int stok, int kode) {
        this.nama_mainan = nama_mainan;
        this.warna = warna;
        this.keterangan = keterangan;
        this.harga= harga;
        this.stok= stok;
        this.kode= kode;
    }
    
    public String getNama(){
        return nama_mainan;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int getStok(){
        return stok;
    }
    
    public int getKode(){
        return kode;
    }
    public void setNama(String nama_mainan){
        this.nama_mainan = nama_mainan;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public void setKode(int kode){
        this.kode = kode;
    }
    
    
        
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    ArrayList<mainan> mainan1 = new ArrayList<>();
    
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
        mainan1.add (x);
        
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
        System.out.println("===========================================");
        System.out.println("                UBAH DATA                  ");
        System.out.println("===========================================");
        System.out.println("Masukan nama mainan yang ingin di ubah : ");
        String findmainan = br.readLine();
        
        for(mainan dataMainan : mainan1){
            if(dataMainan.getNama().equals(findmainan)){
                System.out.println("........................................");
                System.out.print("Masukkan nama mainan terbaru : ");
                dataMainan.setNama(br.readLine());
                System.out.print("Masukkan warna terbaru : ");
                dataMainan.setWarna(br.readLine());
                System.out.print("Masukkan keterangan terbaru: ");
                dataMainan.setKeterangan(br.readLine());
                System.out.print("Masukkan harga mainan terbaru: ");
                dataMainan.setHarga(Integer.parseInt(input.readLine()));
                System.out.print("Masukkan stok  terbaru: ");
                dataMainan.setStok(Integer.parseInt(input.readLine()));  
            }
        }
        System.out.print("""
                         ........................................
                              >>> DATA BERHASIL DIUBAH <<<   
                         """);
    }
    
    void hapus_mainan() throws IOException{
        lihat_mainan();
        System.out.println("===========================================");
        System.out.println("                HAPUS DATA                  ");
        System.out.println("===========================================");
        System.out.print("Masukan Nama Mainan Yang Ingin Dihapus : ");
        String findmainan1 = br.readLine();
        for(int i = 0; i< mainan1.size(); i++){
            if(mainan1.get(i).getNama().equals(findmainan1)){
                mainan1.remove(i);
            }
        }
        System.out.print("""
                         ........................................
                              >>> DATA BERHASIL DIHAPUS <<<   
                         """);
    }
}
