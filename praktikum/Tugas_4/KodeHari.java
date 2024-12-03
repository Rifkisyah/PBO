/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;

public class KodeHari {
    int kode;
    
    void info_hari(){
        switch(kode){
            case 1 -> System.out.println("hari ini adalah hari senin");
            case 2 -> System.out.println("hari ini adalah hari selasa");
            case 3 -> System.out.println("hari ini adalah hari rabu");
            case 4 -> System.out.println("hari ini adalah hari kamis");
            case 5 -> System.out.println("hari ini adalah hari jumat");
            case 6 -> System.out.println("hari ini adalah hari sabtu");
            case 7 -> System.out.println("hari ini adalah hari minggu");
            default -> System.err.println("hari tidak ditemukan");
        }
    }
}
