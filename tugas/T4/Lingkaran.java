/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.T4;

/**
 *
 * @author rifki
 */
public class Lingkaran {
    double jari_jari;
    
    public Lingkaran(double jari_jari){
        if(jari_jari <= 0){
            this.jari_jari = 1.0;
            System.out.println("karena nilai jari jari sama dengan " + jari_jari + " maka jari jari akan bernilai " + this.jari_jari);
        } else {
            this.jari_jari = jari_jari;
            System.out.println("jari jari bernilai " + this.jari_jari);
        }    
    }
}
