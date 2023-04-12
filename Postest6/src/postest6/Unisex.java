/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;
public class Unisex extends Mainan{
   private final String nama_mainan;
   private int kodeU;
    
    public Unisex(String nama_mainan, String warna, String keterangan, int harga, int stok, int kodeU){
        super (nama_mainan, warna, keterangan, harga, stok);
        this.kodeU = kodeU;
        this.nama_mainan = nama_mainan;
    }
    
    public int getkodeU(){
        return kodeU;
    }
    
    public void setkodeU(int kodeU){
        this.kodeU = kodeU;
    }
    
    @Override
    public void lihatInfo(){
        super.lihatInfo();
        System.out.println("Kode         :" + this.kodeU);
    }
    
    //Overloading
    public void lihatInfo(boolean showKodeU){
        if (showKodeU) lihatInfo();
        else super.lihatInfo();
    }
    
    protected void pesan(){
        System.out.println("Mainan sudah di pesan");
    }
    
    public void pembeli(){
      System.out.println("Mainan Dibeli oleh orang");
    }
    
    public void pembeli(String orang){
        System.out.println("Mainan Dibeli oleh   : "+orang);
    }
}

