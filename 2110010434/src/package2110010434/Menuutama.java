/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package package2110010434;
import Fasilitas.*;
/**
 *
 * @author Arib                               //Main Class nya Ini...!!
 */
public class Menuutama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penyakit objku = new Penyakit();
         
        objku.setNmPenyakit("");
       System.out.println("Nama Penyakit : "+objku.getNmPenyakit());
       
       Stokdarah objku2 = new Stokdarah();
      
       objku2.setStok("");
       System.out.println("Sisa Stok Darah yang Tersedia : "+objku2.getStok());
       
       Member objku3 = new Member();
       
       objku3.setNama("");
       System.out.println("Nama Member : "+objku3.getNama());
       
       Pelayanan objku4 = new Pelayanan();
       
       objku4.setPpelayanan("pelayanan");
       System.out.println("Pelayanan yang tersedia : "+objku4.getPpelayanan());
       
       Ruangan objku5 = new Ruangan();
       
       objku5.setUGD("");
       System.out.println("Ruangan UGD yang tersedia : "+objku5.getUGD());//Kalau Darurat tersedia 1 sebaliknya berarti 0
       objku5.setIGD("Tersedia");
       System.out.println("Ruangan IGD yang tersedia : "+objku5.getIGD());//Kalau "Tersedia" berarti ada 1 ruangan
       
       Jadwaldokter objku6 = new Jadwaldokter();
       objku6.setJadwalSiang("");
       System.out.println("Jadwal Kehadiran Dokter : "+objku6.getJadwalSiang());
       objku6.setJadwalMalam("Malam");
       System.out.println("Jadwal Kehadiran Dokter : "+objku6.getJadwalMalam());
       objku6.InfoJadwalDokter();
       
       Berita objku7 = new Berita();
       objku7.setBberita("");
       System.out.println("Berita yang ada saat ini : "+objku7.getBberita());
    }
    
           
}
