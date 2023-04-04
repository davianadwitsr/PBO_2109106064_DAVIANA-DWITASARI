/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    
    static ArrayList<Perempuan> perempuan1 = new ArrayList<>();
    static ArrayList<LakiLaki> lakilaki1 = new ArrayList<>();
    static ArrayList<Unisex> unisex1 = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        while(true){
          menu();
      }
    }
    
    public static void menu() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        System.out.print("""
                =======================================
                         SISTEM PENDATAAN MAINAN
                       DI TOKO MAINAN SUN THAI TEA
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                               MENU UTAMA 
                             
                            [1] Tambah Data
                            [2] Lihat Data
                            [3] Edit Data
                            [4] Hapus Data
                            [5] Exit
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """);
        System.out.print ("Silahkan Pilih Menu Yang Tersedia : ");
        int pilih = Integer.parseInt(br.readLine());
            switch (pilih){
            case 1:
                    tambah_data();
                    break;
            case 2:
                    lihat_data();
                    break;
            case 3:
                    ubah_data();
                    break;
            case 4:
                    hapus_data();
                    break;
            case 5:
                    exit();
                    break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak valid");
                menu(); 
            } 
    }
    
    public static void tambah_data() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        System.out.print("""
                                 =======================================
                                         MENU TAMBAH DATA MAINAN
                                 =======================================
                                  [1] Tambah Data Mainan Anak Perempuan
                                  [2] Tambah Data Mainan Anak Laki-Laki
                                  [3] Tambah Data Mainan Anak Unisex
                                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                 """);
                System.out.print ("Silahkan Pilih Menu Yang Tersedia : ");
                int menu_tambah = Integer.parseInt(br.readLine());
                
                switch(menu_tambah){
                    case 1 :
                        System.out.println("========================================");
                        System.out.println("    TAMBAH DATA MAINAN ANAK PEREMPUAN   ");
                        System.out.println("========================================");
                        System.out.print("Nama Mainan : ");
                        String nama_mainanP = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Warna : ");
                        String warnaP = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Keterangan : ");
                        String keteranganP = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Harga : ");
                        int hargaP = Integer.parseInt(br.readLine());
                        System.out.println("........................................");
                        System.out.print("Stok : ");
                        int stokP = Integer.parseInt(br.readLine());
                        System.out.println("........................................");
                        System.out.print("Code mainan : ");
                        int kodeMP = Integer.parseInt(br.readLine());
                        System.out.print("""
                                         ........................................
                                            >>> DATA BERHASIL DITAMBAHKAN <<<   
                                         """);
                        Perempuan newPerempuan = new Perempuan (nama_mainanP, warnaP, keteranganP, hargaP, stokP, kodeMP);
                        perempuan1.add (newPerempuan);
                        break;
                        
                    case 2 :
                        System.out.println("========================================");
                        System.out.println("    TAMBAH DATA MAINAN ANAK LAKI-LAKI   ");
                        System.out.println("========================================");
                        System.out.print("Nama Mainan : ");
                        String nama_mainanL = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Warna : ");
                        String warnaL = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Keterangan : ");
                        String keteranganL = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Harga : ");
                        int hargaL = Integer.parseInt(br.readLine());
                        System.out.println("........................................");
                        System.out.print("Stok : ");
                        int stokL = Integer.parseInt(br.readLine());
                        System.out.println("........................................");
                        System.out.print("Code mainan : ");
                        int kodeML = Integer.parseInt(br.readLine());
                        System.out.print("""
                                         ........................................
                                            >>> DATA BERHASIL DITAMBAHKAN <<<   
                                         """);
                        LakiLaki newLakilaki = new LakiLaki (nama_mainanL, warnaL, keteranganL, hargaL, stokL, kodeML);
                        lakilaki1.add (newLakilaki);
                        break;
                        
                    case 3 : 
                        System.out.println("========================================");
                        System.out.println("     TAMBAH DATA MAINAN ANAK UNISEX     ");
                        System.out.println("========================================");
                        System.out.print("Nama Mainan : ");
                        String nama_mainanU = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Warna : ");
                        String warnaU = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Keterangan : ");
                        String keteranganU = br.readLine();
                        System.out.println("........................................");
                        System.out.print("Harga : ");
                        int hargaU = Integer.parseInt(br.readLine());
                        System.out.println("........................................");
                        System.out.print("Stok : ");
                        int stokU = Integer.parseInt(br.readLine());
                        System.out.println("........................................");
                        System.out.print("Code mainan : ");
                        int kodeMU = Integer.parseInt(br.readLine());
                        System.out.print("""
                                         ........................................
                                            >>> DATA BERHASIL DITAMBAHKAN <<<   
                                         """);
                        Unisex newUnisex= new Unisex (nama_mainanU, warnaU, keteranganU, hargaU, stokU, kodeMU);
                        unisex1.add (newUnisex);
                        break;
                }
    }
    
    static void lihat_data() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        System.out.print("""
                                 =======================================
                                         MENU LIHAT DATA MAINAN
                                 =======================================
                                  [1] Lihat Data Mainan Anak Perempuan
                                  [2] Lihat Data Mainan Anak Laki-Laki
                                  [3] Lihat Data Mainan Anak Unisex
                                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                 """);
                System.out.print ("Silahkan Pilih Menu Yang Tersedia : ");
                int menu_lihat = Integer.parseInt(br.readLine());
                
                switch(menu_lihat){
                    case 1 :
                        if (perempuan1.isEmpty()) {
                            System.out.println("........................................");
                            System.out.println("       !!! DATA BELUM TERISI !!!        ");
                            return;
                        }
                            System.out.println("========================================");
                            System.out.println("    LIHAT DATA MAINAN ANAK PEREMPUAN    ");
                            System.out.println("========================================");
                            System.out.println("             Tampilkan Kode             ");
                            System.out.println("                1. Ya                   ");
                            System.out.println("                2. Tidak                ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.print(">>");
                            int cek = Integer.parseInt(br.readLine());
                            for (int i =0; i < perempuan1.size(); i++){
                                if(cek==1)perempuan1.get(i).lihatInfo();
                                else perempuan1.get(i).lihatInfo(false);
                            }
                    break;
                        
                    case 2 :
                        if (lakilaki1.isEmpty()) {
                            System.out.println("........................................");
                            System.out.println("       !!! DATA BELUM TERISI !!!        ");
                            return;
                        }
                            System.out.println("========================================");
                            System.out.println("    LIHAT DATA MAINAN ANAK Laki-Laki    ");
                            System.out.println("========================================");
                            System.out.println("             Tampilkan Kode             ");
                            System.out.println("                1. Ya                   ");
                            System.out.println("                2. Tidak                ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.print(">>");
                            int cek1 = Integer.parseInt(br.readLine());
                            for (int i =0; i < lakilaki1.size(); i++){
                                if(cek1==1)lakilaki1.get(i).lihatInfo();
                                else lakilaki1.get(i).lihatInfo(false);
                    }
                    break;
                    
                    case 3 :
                        if (unisex1.isEmpty()) {
                            System.out.println("........................................");
                            System.out.println("       !!! DATA BELUM TERISI !!!        ");
                            return;
                        }
                            System.out.println("========================================");
                            System.out.println("      LIHAT DATA MAINAN ANAK UNISEX     ");
                            System.out.println("========================================");
                            System.out.println("             Tampilkan Kode             ");
                            System.out.println("                1. Ya                   ");
                            System.out.println("                2. Tidak                ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.print(">>");
                            int cek2 = Integer.parseInt(br.readLine());
                            for (int i =0; i < unisex1.size(); i++){
                                if(cek2==1)unisex1.get(i).lihatInfo();
                                else unisex1.get(i).lihatInfo(false);
                    }
                    break;
                }
    }

    
    static void ubah_data() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        System.out.print("""
                                 =======================================
                                         MENU UBAH DATA MAINAN
                                 =======================================
                                  [1] Ubah Data Mainan Anak Perempuan
                                  [2] Ubah Data Mainan Anak Laki-Laki
                                  [3] Ubah Data Mainan Anak Unisex
                                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                 """);
                System.out.print ("Silahkan Pilih Menu Yang Tersedia : ");
                int ubah_data = Integer.parseInt(br.readLine());
                
                switch(ubah_data){
                    case 1 :
                        System.out.println("===========================================");
                        System.out.println("   MENU UBAH DATA MAINAN ANAK PEREMPUAN    ");
                        System.out.println("===========================================");
                        System.out.println("Masukan nama mainan yang ingin di ubah : ");
                        String findmainan = br.readLine();
                        
                        for(Mainan dataMainanP : perempuan1){
                            if(dataMainanP.getNama().equals(findmainan)){
                                System.out.println("........................................");
                                System.out.print("Masukkan nama mainan terbaru : ");
                                dataMainanP.setNama(br.readLine());
                                System.out.print("Masukkan warna terbaru : ");
                                dataMainanP.setWarna(br.readLine());
                                System.out.print("Masukkan keterangan terbaru: ");
                                dataMainanP.setKeterangan(br.readLine());
                                System.out.print("Masukkan harga mainan terbaru: ");
                                dataMainanP.setHarga(Integer.parseInt(br.readLine()));
                                System.out.print("Masukkan stok  terbaru: ");
                                dataMainanP.setStok(Integer.parseInt(br.readLine()));  
                            }
                        }
                        System.out.print("""
                         ........................................
                              >>> DATA BERHASIL DIUBAH <<<   
                         """);
                    break;
                    
                    case 2:
                        System.out.println("===========================================");
                        System.out.println("   MENU UBAH DATA MAINAN ANAK LAKI-LAKI    ");
                        System.out.println("===========================================");
                        System.out.println("Masukan nama mainan yang ingin di ubah : ");
                        String findmainan1 = br.readLine();
                        
                        for(Mainan dataMainanL : lakilaki1){
                            if(dataMainanL.getNama().equals(findmainan1)){
                                System.out.println("........................................");
                                System.out.print("Masukkan nama mainan terbaru : ");
                                dataMainanL.setNama(br.readLine());
                                System.out.print("Masukkan warna terbaru : ");
                                dataMainanL.setWarna(br.readLine());
                                System.out.print("Masukkan keterangan terbaru: ");
                                dataMainanL.setKeterangan(br.readLine());
                                System.out.print("Masukkan harga mainan terbaru: ");
                                dataMainanL.setHarga(Integer.parseInt(br.readLine()));
                                System.out.print("Masukkan stok  terbaru: ");
                                dataMainanL.setStok(Integer.parseInt(br.readLine()));  
                            }
                        }
                        System.out.print("""
                         ........................................
                              >>> DATA BERHASIL DIUBAH <<<   
                         """);
                    break;
                    
                    case 3:
                        System.out.println("===========================================");
                        System.out.println("   MENU UBAH DATA MAINAN ANAK UNISEX    ");
                        System.out.println("===========================================");
                        System.out.println("Masukan nama mainan yang ingin di ubah : ");
                        String findmainan2 = br.readLine();
                        
                        for(Mainan dataMainanU : unisex1){
                            if(dataMainanU.getNama().equals(findmainan2)){
                                System.out.println("........................................");
                                System.out.print("Masukkan nama mainan terbaru : ");
                                dataMainanU.setNama(br.readLine());
                                System.out.print("Masukkan warna terbaru : ");
                                dataMainanU.setWarna(br.readLine());
                                System.out.print("Masukkan keterangan terbaru: ");
                                dataMainanU.setKeterangan(br.readLine());
                                System.out.print("Masukkan harga mainan terbaru: ");
                                dataMainanU.setHarga(Integer.parseInt(br.readLine()));
                                System.out.print("Masukkan stok  terbaru: ");
                                dataMainanU.setStok(Integer.parseInt(br.readLine()));  
                            }
                        }
                        System.out.print("""
                         ........................................
                              >>> DATA BERHASIL DIUBAH <<<   
                         """);
                    break;
                }
    }

    
    static void hapus_data() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        System.out.print("""
                                 =======================================
                                         MENU HAPUS DATA MAINAN
                                 =======================================
                                  [1] Hapus Data Mainan Anak Perempuan
                                  [2] Hapus Data Mainan Anak Laki-Laki
                                  [3] Hapus Data Mainan Anak Unisex
                                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                 """);
                System.out.print ("Silahkan Pilih Menu Yang Tersedia : ");
                int hapus_data = Integer.parseInt(br.readLine());
                
                switch(hapus_data){
                    case 1 :
                        System.out.println("===========================================");
                        System.out.println("   MENU HAPUS DATA MAINAN ANAK PEREMPUAN   ");
                        System.out.println("===========================================");
                        System.out.print("Masukan Nama Mainan Yang Ingin Dihapus : ");
                        
                        String findmainan3 = br.readLine();
                        for(int i = 0; i< perempuan1.size(); i++){
                            if(perempuan1.get(i).getNama().equals(findmainan3)){
                                perempuan1.remove(i);
                            }
                        }
                        System.out.print("""
                                         ........................................
                                              >>> DATA BERHASIL DIHAPUS <<<   
                                         """);
                    break;
                    
                    case 2 :
                        System.out.println("===========================================");
                        System.out.println("   MENU HAPUS DATA MAINAN ANAK LAKI-LAKI   ");
                        System.out.println("===========================================");
                        System.out.print("Masukan Nama Mainan Yang Ingin Dihapus : ");
                        
                        String findmainan4 = br.readLine();
                        for(int i = 0; i< lakilaki1.size(); i++){
                            if(lakilaki1.get(i).getNama().equals(findmainan4)){
                                lakilaki1.remove(i);
                            }
                        }
                        System.out.print("""
                                         ........................................
                                              >>> DATA BERHASIL DIHAPUS <<<   
                                         """);
                    break;
                    
                    case 3 :
                        System.out.println("===========================================");
                        System.out.println("     MENU HAPUS DATA MAINAN ANAK UNISEX    ");
                        System.out.println("===========================================");
                        System.out.print("Masukan Nama Mainan Yang Ingin Dihapus : ");
                        
                        String findmainan5 = br.readLine();
                        for(int i = 0; i< unisex1.size(); i++){
                            if(unisex1.get(i).getNama().equals(findmainan5)){
                                unisex1.remove(i);
                            }
                        }
                        System.out.print("""
                                         ........................................
                                              >>> DATA BERHASIL DIHAPUS <<<   
                                         """);
                    break;
                    
                }
    }
    
    static void exit() throws IOException{
                System.out.println("!!! Anda Telah Keluar dari Program !!! ");
                System.exit(0);
    }
        
}

