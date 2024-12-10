/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.p11;

// materi class relationship

public class Main {
    public static void main(String[] args) {
        Kelas a = new Kelas("A");
        Siswa siswa1 = new Siswa();
        Siswa siswa2 = new Siswa();
        Siswa siswa3 = new Siswa();
        Siswa siswa4 = new Siswa();
        
        siswa1.setNama_siswa("udin");
        siswa2.setNama_siswa("cahyo");
        siswa3.setNama_siswa("rama");
        siswa4.setNama_siswa("joko");
        
        a.addSiswa(siswa1);
        a.addSiswa(siswa2);
        a.addSiswa(siswa3);
        a.addSiswa(siswa4);
        
        a.display();
    }
    
    
}
