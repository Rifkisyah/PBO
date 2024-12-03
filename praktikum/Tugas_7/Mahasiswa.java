/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;

public class Mahasiswa extends CivitasFakultasTeknik {
    public Mahasiswa(String nama, String status){
        this.nama = nama;
        this.status = status;
    }
    
    @Override
    void infoMahasiswa(){
        System.out.println("Mahsiswa bernama " + this.nama + " merupakan seorang " + this.status + " di kampus");
    }
}
