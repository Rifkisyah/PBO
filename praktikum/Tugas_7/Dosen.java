/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;

public class Dosen extends CivitasFakultasTeknik {
    
    public Dosen(String nama, String status){
        this.nama = nama;
        this.status = status;
    }
    
    @Override
    void infoDosen(){
        System.out.println("Dosen bernama " + this.nama + " merupakan seorang " + this.status + " di kampus");
    }
}
