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
public class datasetRuangan {
    private ArrayList<String>UGD;
    private ArrayList<String>IGD;

public datasetRuangan(){
    UGD = new ArrayList<String>();
    IGD = new ArrayList<String>();
}
public void insertUGD(String ugd){
    this.UGD.add(ugd);
}
public ArrayList<String> getRecUGD(){
    return this.UGD;
}
public void insertIGD(String igd){
    this.IGD.add(igd);
}
public ArrayList<String> getRecIGD(){
    return this.IGD;
}
}

