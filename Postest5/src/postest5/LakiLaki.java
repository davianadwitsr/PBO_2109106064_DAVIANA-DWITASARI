/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest5;

public class LakiLaki extends Mainan {
    private final String nama_mainan;
    private int kodeL;
    
    public LakiLaki(String nama_mainan, String warna, String keterangan, int harga, int stok, int kodeL){
        super (nama_mainan, warna, keterangan, harga, stok);
        this.kodeL = kodeL;
        this.nama_mainan = nama_mainan;
    }
    
    public int getkodeL(){
        return kodeL;
    }
    
    public void setkodeL(int kodeL){
        this.kodeL = kodeL;
    }
    
    @Override
    public void lihatInfo(){
        super.lihatInfo();
        System.out.println("Kode         :" + this.kodeL);
    }
    
    //Overloading
    public void lihatInfo(boolean showKodeL){
        if (showKodeL) lihatInfo();
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

