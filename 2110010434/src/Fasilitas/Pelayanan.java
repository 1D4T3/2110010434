/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;

/**
 *
 * @author Arib
 */
public class Pelayanan {
    private String pelayanan;
    
public Pelayanan(){}

public void setPelayanan(String pelayanan){
  if(pelayanan.equals("VIP")){
      this.pelayanan=("Pelayanan VIP Tersedia");
  }  else{this.pelayanan=("Pelayanan Reguler Tersedia");}
}
public String getPelayanan(){
    return this.pelayanan;
}
}
