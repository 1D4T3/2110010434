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
public class datasetMember {
    private ArrayList<String>nama;
    private ArrayList<Integer>noKartu;
    
public datasetMember(){
    nama = new ArrayList<String>();
    noKartu = new ArrayList<Integer>();
}    
public void insertMember(String nmM){
    this.nama.add(nmM);
}
public ArrayList<String> getRecMember(){
    return this.nama;
}
public void insertKartu(int no){
    this.noKartu.add(no);
}
public ArrayList<Integer> getRecKartu(){
    return this.noKartu;
}
}
