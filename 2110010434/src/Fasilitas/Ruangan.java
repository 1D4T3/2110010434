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
    private String UGD;
    private String IGD;
    
public Ruangan(){}

public Ruangan(String says){
    System.out.println(says);
} 
public void setUGD(String status){
if  (status.equals("Ada")){    
    this.UGD=("Ruangan UGD Tersedia");
}else{this.UGD=("Ruangan UGD Tidak Tersedia");}
}
public String getUGD(){
return this.UGD;
}
public void setIGD(String status){
if  (status.equals("Ada")){    
    this.IGD=("Ruangan IGD Tersedia");
}else{this.IGD=("Ruangan IGD Tidak Tersedia");}
}
public String getIGD(){
return this.IGD;
}
}
