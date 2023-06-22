/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
/**
 *
 * @author Arib
 */
public class datasetPenyakit {
   private ArrayList<String>penyakit;
   
public datasetPenyakit(){
    penyakit = new ArrayList<String>();
}
public void insertPenyakit(String pKit){
    this.penyakit.add(pKit);
}
public ArrayList<String> getRecPenyakit(){
    return this.penyakit;
}
}
