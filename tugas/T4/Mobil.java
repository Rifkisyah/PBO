/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.T4;

/**
 *
 * @author rifki
 */
public class Mobil {
    String merek;
    String Model;
    int tahun;
    
    public Mobil(String merek, String model){
        this.merek = merek;
        this.Model = model;
        this.tahun = 2020;
    }
    
    public Mobil(String merek, String model, int tahun){
        this.merek = merek;
        this.Model = model;
        this.tahun = tahun;
    }
    
    void info(){
        System.out.println("mobil bermerek " + this.merek + " dengan model " + this.Model + " adalah keluaran tahun " + this.tahun);
    }
}
