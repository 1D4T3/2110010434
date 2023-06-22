/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;

/**
 *
 * @author Arib
 */
public class Dokter {
   private String nmdokter;
   private int iddokter;
   
public Dokter(){}

public Dokter(String says){
    System.out.println(says);
}

public void setnmDokter(String nama){
if(nama.equals("Arib")){
    this.nmdokter=("Dokter Arib Tersedia Untuk Pasien");
}else{this.nmdokter=("Hanya ada 1 Dokter di Instansi ini ");}
}
public String getnmDokter(){
    return this.nmdokter;
}
public void setidDokter(int no){
this.iddokter=(434);    
}
public Integer getidDokter(){
    return this.iddokter;
}
}
