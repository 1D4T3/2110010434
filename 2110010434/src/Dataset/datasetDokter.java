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
public class datasetDokter {
    private ArrayList<String>nama;
    private ArrayList<Integer>id;

    
public datasetDokter(){
    nama = new ArrayList<String>();
    id = new ArrayList<Integer>();
}
public void insertnmDokter(String nmD){
    this.nama.add(nmD);
}
public ArrayList<String> getRecnmDokter(){
    return this.nama;
}
public void insertidDokter(int idD){
    this.id.add(idD);
}
public ArrayList<Integer> getRecidDokter(){
    return this.id;
}
}
