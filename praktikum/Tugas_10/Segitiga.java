/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_10;

/**
 *
 * @author rifki
 */
public class Segitiga extends Bentuk {
    int alas, tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    void luas(){
        this.luas = (int)(0.5 * this.alas * this.tinggi);
        System.out.println("luas segitiga : " + this.luas);
    }
}
