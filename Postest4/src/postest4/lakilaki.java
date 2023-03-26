/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

public class lakilaki extends mainan {
    private int kodeL;
    
    public lakilaki(String nama_mainan, String warna, String keterangan, int harga, int stok, int kodeL){
        super (nama_mainan, warna, keterangan, harga, stok);
        this.kodeL = kodeL;
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
}

