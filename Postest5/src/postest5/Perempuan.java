/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest5;

final class Perempuan extends Mainan{
    private final String nama_mainan;
    private int kodeP;
    
    public Perempuan(String nama_mainan, String warna, String keterangan, int harga, int stok, int kodeP){
        super (nama_mainan, warna, keterangan, harga, stok);
        this.kodeP = kodeP;
        this.nama_mainan = nama_mainan;
    }
    
    public int getkodeP(){
        return kodeP;
    }
    
    public void setkodeP(int kodeP){
        this.kodeP = kodeP;
    }
    
    @Override
    public void lihatInfo(){
        super.lihatInfo();
        System.out.println("Kode         :" + this.kodeP);
    }
    
    //Overloading
    public void lihatInfo(boolean showKodeP){
        if (showKodeP) lihatInfo();
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
