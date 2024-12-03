/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_9;

/**
 *
 * @author jarkom-2
 */
public class Main {
    static void soal1(){
        Hewan hewan = new Hewan();
        
        System.out.println("Macam-macam " + hewan.nama + " : ");
        hewan.hewanBerkakiDua();
        hewan.hewanBerkakiEnam();
        hewan.hewanBerkakiEmpat();
        hewan.hewanBerkakiDelapan();
        System.out.println("\nContoh hewan : ");
        
        Hewan contoh_hewan = new ContohHewan();
        contoh_hewan.hewanBerkakiDua();
        contoh_hewan.hewanBerkakiEnam();
        contoh_hewan.hewanBerkakiEmpat();
        contoh_hewan.hewanBerkakiDelapan();
    }
    
    static void soal2(){
        Segitiga segitiga1 = new Segitiga(4, 5);
        segitiga1.hitungLuas();
    }
    
    static void soal3(){
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(3);
        kubus1.infoVolumeKubus();
    }
    
    static void soal4(){
        Hewan hewan1 = new Kucing("allan");
        System.out.println("Kucing bernama " + hewan1.display());
        hewan1.makan();
    }
    
    static void soal5(){
        Produk produk1 = new Komik("Detective Conan", "manusia 1");
        Produk produk2 = new Game("Black myth Wukong", "manusia 2");
        
        produk1.getInfoProduk();
        System.out.println("");
        produk2.getInfoProduk();
    }
    
    static void soal6(){
        Produk produk1 = new Komik("doraemon", "manusia 1", 225);
        Produk produk2 = new Game("gta 5", "manusia 2", 10);
        
        produk1.getInfoProduk();
        System.out.println("");
        produk2.getInfoProduk();
    }
    
    public static void main(String[] args) {
        soal1();
    }
}
