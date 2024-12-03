/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.T4;

/**
 *
 * @author rifki
 */
public class Buku {
    String judul, pengarang;
    int tahun_terbit;
    
    public Buku(String judul, String pengarang, int tahun_terbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
    }
    
    public Buku(){
        this.judul = null;
        this.pengarang = null;
        this.tahun_terbit = 0;
    }
    
    void info(){
        System.out.println("buku berjudul " + this.judul + " dibuat oleh pengarang bernama " + this.pengarang + " dan diterbitkan pada tahun " + this.tahun_terbit);
    }
}
