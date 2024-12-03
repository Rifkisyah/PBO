/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.p3;

/**
 *
 * @author rifki
 */
public class Mahasiswa {
    String NPM;
    String nama;
    double IPK;
    int UKT_lunas;
    int semester;
    
    void lulus_semester(){
        if(bayar_UKT() && belajar_dan_mendapatkan_nilai_bagus()){
            System.out.println("mahasiswa NPM " + this.NPM + " yang bernama " + this.nama + " lulus sebagai mahasiswa semester " + this.semester + " dan dapat melanjutkan ke semester / jenjang selanjutnya");
        }else{
            System.out.println("maaf, untuk mahasiswa NPM " + this.NPM + " yang bernama " + this.nama + " belum dapat lulus dikarenakan terdapat persyaratan yang belum selesai");
        }
    }
    
    boolean bayar_UKT(){
        if (this.UKT_lunas == 10000000){
            return true;
        }else{
            return false;
        }
    }
    
    boolean belajar_dan_mendapatkan_nilai_bagus(){
        if (this.IPK > 3.00){
            return true;
        }else{
            return false;
        }
    } 
}
