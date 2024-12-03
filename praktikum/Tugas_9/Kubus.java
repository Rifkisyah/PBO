/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_9;

/**
 *
 * @author jarkom-2
 */
public class Kubus {
    private int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    private int volumeKubus(){
        int volume = sisi*sisi*sisi;
        return volume;
    }
    
    public void infoVolumeKubus(){
        System.out.println("Sisi kubus : " + this.sisi + "\nVolume Kubus : " + this.volumeKubus());
    }
}
