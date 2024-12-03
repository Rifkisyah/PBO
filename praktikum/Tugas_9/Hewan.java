/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_9;

/**
 *
 * @author jarkom-2
 */
public class Hewan {
    String nama;

    public Hewan() {
    
    }
   
    void hewanBerkakiDua(){
        System.out.println("hewan berkaki dua");
    }
    void hewanBerkakiEmpat(){
        System.out.println("hewan berkaki empat");
    }
    void hewanBerkakiEnam(){
        System.out.println("hewan berkaki enam");
    }
    void hewanBerkakiDelapan(){
        System.out.println("hewan berkaki delapan");
    }
    
    Hewan(String nama){
        this.nama = nama;
    }
    
    void makan(){
        System.out.println("sedang makan...");
    }
    
    String display(){
        return null;
    }
}
