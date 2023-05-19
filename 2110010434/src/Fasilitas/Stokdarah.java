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
public class Stokdarah {
    private String Stok;
    
    public Stokdarah(){}
    
    public void setStok(String Stock){
    Scanner objku2 = new Scanner(System.in);
    System.out.println("Stok Darah : ");
    Stock = objku2.nextLine();
    this.Stok = Stock;
    }
    public String getStok(){
    return this.Stok;
    }
    
}
