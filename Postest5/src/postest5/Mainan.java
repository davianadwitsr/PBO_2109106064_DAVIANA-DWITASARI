/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest5;

public abstract class Mainan {
    protected String nama_mainan; 
    protected String warna; 
    protected String keterangan;
    protected int harga;
    protected int stok;
    
    public Mainan(String nama_mainan, String warna, String keterangan, int harga, int stok) {
        this.nama_mainan = nama_mainan;
        this.warna = warna;
        this.keterangan = keterangan;
        this.harga= harga;
        this.stok = stok;
    }
    
    protected abstract void pesan();
    
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
    
    public void lihatInfo(){
        System.out.println("Nama Mainan  :" + this.nama_mainan);
        System.out.println("warna        :" + this.warna);
        System.out.println("Keterangan   :" + this.keterangan);
        System.out.println("Harga        :" + this.harga);
        System.out.println("Stok         :" + this.stok);
    }
    
    void idata(){
        System.out.println("Data Mainan berhasil ditambah");
    }
    
    void udata(){
        System.out.println("Data Mainan berhasil diubah");
    }
    
    void hdata(){
        System.out.println("Data Mainan berhasil dihapus");
    }
}
