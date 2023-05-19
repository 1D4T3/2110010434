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
public class Member {
    private String Nama;
    private int NoKartu;
    
    public Member(){}
    
    public void setNama(String nama){
    Scanner objku3 = new Scanner(System.in);
    System.out.println("Nama : ");
    nama = objku3.nextLine();
    this.Nama = nama;
    }
    public String getNama(){
    return this.Nama;
    }

}
