/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;

public class Staff extends CivitasFakultasTeknik {
    public Staff(String nama, String status){
        this.nama = nama;
        this.status = status;
    }
    
    @Override
    void infoStaff(){
        System.out.println("Staff bernama " + this.nama + " merupakan seorang " + this.status + " di kampus");
    }
}
