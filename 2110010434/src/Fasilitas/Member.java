/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fasilitas;

/**
 *
 * @author Arib
 */
public class Member {
    private String nmMember;
    private int noKartu;
    
 public Member(){}
 
 public Member(String nama){
     setNama(nama);
 }
 public Member(String nama, int no){
     setNama(nama);
     setKartu(no);
 }
 
// public Member(String says){
// System.out.println(says);
// }
 
 public void setNama(String nama){
    if(nama.equals("Arib")){
    this.nmMember=("Selamat Datang Arib");
    }else{this.nmMember=("Anda Tidak Terdaftar diMember");}
 }
 public String getNama(){
     return this.nmMember;
 }
 public void setKartu(int no){
 this.noKartu=(434);
 }
 public Integer getKartu(){
 return this.noKartu;
 }
 public String kartuMember(){
     return getNama()+ getKartu();
 }
 public String kartuMember(String x, int y){
     setNama(x);
     setKartu(y);
     return getNama()+ getKartu();
 }
}
