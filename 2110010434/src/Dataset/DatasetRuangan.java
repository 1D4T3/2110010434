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
public class DatasetRuangan {
    private ArrayList<String> UGD;
    private ArrayList<String> IGD;

public DatasetRuangan(){
    UGD = new ArrayList<String>();
    IGD = new ArrayList<String>();
}
public void insertUGD(String UGD){
    this.UGD.add(UGD);
}
public ArrayList<String> getReportUGD(){
  return this.UGD;  
}
public void insertIGD(String IGD){
    this.IGD.add(IGD);
}
public ArrayList<String> getReportIGD(){
  return this.IGD;  
}
}