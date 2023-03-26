/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;
public class unisex extends mainan{
   private int kodeU;
    
    public unisex(String nama_mainan, String warna, String keterangan, int harga, int stok, int kodeU){
        super (nama_mainan, warna, keterangan, harga, stok);
        this.kodeU = kodeU;
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
}

