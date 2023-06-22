/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;

/**
 *
 * @author Arib
 */
public class Berita {
     private String Bberita;
    
    public Berita(){}
    
    public Berita(String says){
    System.out.println(says);
    }
    
    public void setBberita(String status){
    if(status.equals("1")){
        this.Bberita=("Berita belum update !");
    }else{this.Bberita=("Sedang Maintenance...");}//Kalau memilih selain dari no 1 akan ada hasil "Sedang Maintenance..."
    }
    public String getBberita(){
    return this.Bberita;
    }   
}
