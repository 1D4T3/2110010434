/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;
import java.util.Scanner;
/**
 *
 * @author Arib
 */
public class Pelayanan {
 private String Ppelayanan;
 
    public Pelayanan(){}

    public void setPpelayanan(String pelayanan){
        Scanner objku4 = new Scanner(System.in);
        System.out.println("Silahkan Input Pelayanan Anda : ");
        pelayanan = objku4.nextLine();
        this.Ppelayanan = pelayanan;
        
}
    public String getPpelayanan(){
    return this.Ppelayanan;
    }
    
}
