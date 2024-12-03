/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_9;

/**
 *
 * @author jarkom-2
 */
public class Segitiga {
    protected int alas, tinggi;
    
    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    protected void hitungLuas(){
        int luas = (int)(0.5 * alas * tinggi);
        
        System.out.println("Alas : " + this.alas + "\nTinggi : " + this.tinggi + "\nLuas Segitiga : " + luas);
    }
}
