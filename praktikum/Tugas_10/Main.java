/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_10;

/**
 *
 * @author rifki
 */
public class Main {
    static void soal1(){
        Bentuk persegi_panjang = new PersegiPanjang(4, 2);
        Bentuk bujur_sangkar = new BujurSangkar(6);
        Bentuk segitiga = new Segitiga(3, 6);
        Bentuk lingkaran = new Lingkaran(9);
        
        persegi_panjang.luas();
        bujur_sangkar.luas();
        segitiga.luas();
        lingkaran.luas();
    }
    
    static void soal2(){
        DataUniversitasCianjur univ = new DataUniversitasCianjur("Universitas Suryakancana", "Pasir Gede", "Jawa Barat", "Indonesia", "08123-3210-3123");
        univ.display();
    }
    
    static void soal3(){
        
    }
    
    public static void main(String[] args) {
        soal2();
    }
}
