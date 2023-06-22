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
public class datasetPelayanan {
    private ArrayList<String>pelayanan;
    
public datasetPelayanan(){
    pelayanan = new ArrayList<String>();
}    
public void insertPelayanan(String nmP){
    this.pelayanan.add(nmP);
}
public ArrayList<String> getRecPelayanan(){
    return this.pelayanan;
}
}
