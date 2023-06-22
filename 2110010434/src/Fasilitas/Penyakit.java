/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;

/**
 *
 * @author Arib
 */
public class Penyakit {
  private String nmPenyakit;

public Penyakit(){}

public void setPenyakit(String nama){
if (nama.equals("Hypothermia")){
    this.nmPenyakit=("Penyakit Hypothermia");
}else{this.nmPenyakit=("Penyakit Demam");}
}
public String getPenyakit(){
return this.nmPenyakit;
}
}

