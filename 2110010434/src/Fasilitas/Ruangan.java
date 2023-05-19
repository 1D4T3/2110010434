/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;

/**
 *
 * @author Arib
 */
public class Ruangan {
    private int UGD;
    private int IGD;
    
public Ruangan(){}

public Ruangan(String says){
    System.out.println(says);
} 
public void setUGD(String status){
if  (status.equals("Darurat")){    
    this.UGD=1;
}else{this.UGD=0;}
}//Kalau keadaan Darurat bearti ada 1 ruangan kalau tidak bearti 0
public int getUGD(){
return this.UGD;
}
public void setIGD(String status){
if  (status.equals("Tersedia")){    
    this.IGD=1;
}else{this.IGD=0;}
}//Bila Tersedia bearti 1 bila tidak tersedia bearti 0
public int getIGD(){
return this.IGD;
}

    public void InfoJadwalDokter(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void InfoJadwalDokter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
