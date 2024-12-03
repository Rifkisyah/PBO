/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_1;

/**
 *
 * @author rifki
 */
public class Main {
    public static void main(String[] args) {
        SukaBelajar belajar = new SukaBelajar();
        Unsur kuliah = new Unsur();
        Informatika jurusan = new Informatika();
        
        System.out.println(belajar.belajar_java + kuliah.kuliah_di + jurusan.mahasiswa_jurusan);
    } 
}

class SukaBelajar{
    String belajar_java = """
                          Saya Suka java
                          Belajar Java Asik
                          Yuk kita enjoy
                          
                          """;
}

class Unsur{
    String kuliah_di = """
                       Universitas Suryakancana
                       Universitas Pilihan di Cianjur
                       Kuliah di Fakultas teknik
                       Jurusan Teknik Informatika
                       
                       """;
}

class Informatika{
    String mahasiswa_jurusan = """
                               Mahasiswa Teknik Informatika Unsur Cianjur
                               Jujur, Amanah, dan Informatikawan
                               Senang Belajar PBO
                               
                               """;
}
