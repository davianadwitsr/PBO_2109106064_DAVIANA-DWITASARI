/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author USER
 */
public class Proses implements Pemesanan {
    
    @Override
    public void pesankan(){
        System.out.println("Mainan sedang di Di cross chek");
    }
    
    public void batal() {
        System.out.println("Mainan dibatalkan");
    }
}
