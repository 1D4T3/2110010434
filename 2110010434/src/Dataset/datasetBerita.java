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
public class datasetBerita {
    private ArrayList<String>berita;
    
    public datasetBerita(){
        berita = new ArrayList<String>();
        
    }
    public void insertBerita(String isi){
        this.berita.add(isi);
    }
    
    public ArrayList<String> getRecordBerita(){
        return this.berita;
    }
}
