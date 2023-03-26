/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

public class perempuan extends mainan{
   private int kodeP;
    
    public perempuan(String nama_mainan, String warna, String keterangan, int harga, int stok, int kodeP){
        super (nama_mainan, warna, keterangan, harga, stok);
        this.kodeP = kodeP;
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
}
