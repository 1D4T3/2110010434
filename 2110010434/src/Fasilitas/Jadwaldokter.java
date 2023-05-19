/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;

/**
 *
 * @author Arib
 */
public class Jadwaldokter {

    private int JadwalPagi;
    private int JadwalMalam;
public Jadwaldokter (){} //Constructor
    
public Jadwaldokter(String says){
    System.out.println(says);
} 
public void setJadwalSiang(String status){
if  (status.equals("Pagi")){    
    this.JadwalPagi=06;
}else{this.JadwalPagi=12;}
}//Pagi dari jam 06:00 Siang dari jam 12:00
public int getJadwalSiang(){
return this.JadwalPagi;
}
public void setJadwalMalam(String status){
if  (status.equals("Malam")){    
    this.JadwalMalam=18;
}else{this.JadwalMalam=24;}
}//Malam dari jam 18:00 
public int getJadwalMalam(){
return this.JadwalMalam;
}
//Overload Contructor Method
public void InfoJadwalDokter(){
System.out.println("INFO JADWAL AKTIVITAS DOKTER");
System.out.println("____________________________");
System.out.println("Jadwal Siang : "+getJadwalSiang());
System.out.println("Jadwal Malam : "+getJadwalMalam());
System.out.println("____________________________");
}
}
