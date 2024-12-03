/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;

public class IdentittasMahasiswa {
    String NPM, nama, kelas;
    
    public IdentittasMahasiswa(String NPM, String nama, String kelas){
        this.NPM = NPM;
        this.nama = nama;
        this.kelas = kelas;
    }
    
    void info(){
        System.out.println("NPM : " + this.NPM + "\nNama : " + this.nama + "\nKelas : " + this.kelas);
    }
}
