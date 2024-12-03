/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.T4;

/**
 *
 * @author rifki
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran();
    }
    
    static void buku(){
        Buku obj = new Buku("Jalan Tuhan", "sucipto", 1990);
        Buku obj2 = new Buku();
        
        obj.info();
        obj2.info();
    }
    
    static void mobil(){
        Mobil obj1 = new Mobil("bmw", "sedan");
        Mobil obj2 = new Mobil("bmw", "sedan", 2024);
        
        obj1.info();
        obj2.info();
    }
    
    static void Lingkaran(){
        Lingkaran obj1 = new Lingkaran(5);
        Lingkaran obj2 = new Lingkaran(0);
    }
}
