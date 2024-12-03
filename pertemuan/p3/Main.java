/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.p3;

/**
 *
 * @author rifki
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(); 
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs1.NPM = "5520123107";
        mhs1.nama = "udin";
        mhs1.UKT_lunas = 10000000;
        mhs1.semester = 3;
        mhs1.IPK = 3.44;
        
        mhs1.lulus_semester();
        
        mhs2.NPM = "555555";
        mhs2.nama = "ucup";
        mhs2.UKT_lunas = 100000;
        mhs2.semester = 7;
        mhs2.IPK = 3.99;
        
        mhs2.lulus_semester();
        
    }
}
