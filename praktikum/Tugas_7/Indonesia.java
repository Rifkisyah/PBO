/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;

public class Indonesia {
    String teks_sumpah_pemuda;
    
    public Indonesia(String txt){
        this.teks_sumpah_pemuda = txt;
    }
    
    public void kalimatSumpahPemuda(){
        if(this.teks_sumpah_pemuda == "Kami putra dan putri Indonesia"){
            System.out.println(this.teks_sumpah_pemuda + ", mengaku bertumpah darah yang satu, tanah air Indonesia.\nKami putra dan putri Indonesia, mengaku berbangsa yanng satu, bangsa Indonesia.\nKami putra dan putri Indonesia, menjunjung bahasa persatuan, Bahasa Indonesia.");
        }else{
            System.out.println("program berhenti");
        }
    }
}
