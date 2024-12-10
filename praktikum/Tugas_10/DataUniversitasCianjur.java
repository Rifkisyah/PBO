/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_10;

/**
 *
 * @author rifki
 */
public class DataUniversitasCianjur {
    String nama_univ, alamat, provinsi, negara, no_telepon;

    public DataUniversitasCianjur(String nama_univ, String alamat, String provinsi, String negara, String no_telepon) {
        this.nama_univ = nama_univ;
        this.alamat = alamat;
        this.provinsi = provinsi;
        this.negara = negara;
        this.no_telepon = no_telepon;
    }
    
    void display(){
        System.out.println("----------------------------------------------------");
        System.out.println("|                Data Universitas Cianjur           |");
        System.out.println("----------------------------------------------------");
        System.out.println("| Nama Universitas    :   " + this.nama_univ);
        System.out.println("| Alamat              :   " + this.alamat);
        System.out.println("| Telepon             :   " + this.no_telepon);
        System.out.println("| provinsi            :   " + this.provinsi);
        System.out.println("| Negara              :   " + this.negara);
        System.out.println("----------------------------------------------------");
    }
}
