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
public class Penyakit {
    private String NmPenyakit;
    
    public Penyakit(){}
    
    public void setNmPenyakit(String nama){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukan Nama Penyakit : " );
            nama = objku.nextLine();
            this.NmPenyakit=nama;
    } 
    public String getNmPenyakit(){
        return this.NmPenyakit;
    }
}
