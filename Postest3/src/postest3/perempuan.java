/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

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
}
