/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_9;

/**
 *
 * @author jarkom-2
 */
public class Game extends Produk{
    int waktu_main;
    
    public Game(String judul, String penulis) {
        super(judul, penulis);
    }
    
    public Game(String judul, String penulis, int waktu_main) {
        super(judul, penulis);
        this.waktu_main = waktu_main;
    }
    
    void getInfoProduk(){
        if(waktu_main != 0){
            System.out.println("judul : " + this.judul);
            System.out.println("penulis : " + this.penulis);
            System.out.println("Waktu main : " + this.waktu_main + " jam");
        } else {
            System.out.println("judul : " + this.judul);
            System.out.println("penulis : " + this.penulis);
        }
        
    }
    
}
