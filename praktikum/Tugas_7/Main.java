/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;

public class Main {
    public static void main(String[] args) {
        CivitasFakultasTeknik civitas1 = new Dosen("Rudi", "Pengajar");
        CivitasFakultasTeknik civitas2 = new Mahasiswa("andy", "Pengurus");
        CivitasFakultasTeknik civitas3 = new Staff("daniel", "Pelajar");
        
        civitas1.infoDosen();
        civitas2.infoMahasiswa();
        civitas3.infoStaff();
    }
}
