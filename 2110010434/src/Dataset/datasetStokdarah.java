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
public class datasetStokdarah {
    private ArrayList<Integer>stok;
    
public datasetStokdarah(){
    stok = new ArrayList<Integer>();
}
public void insertStok(int no){
    this.stok.add(no);
}
public ArrayList<Integer> getRecStok(){
    return this.stok;
}
}
