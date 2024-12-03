/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;

public class TahunKabisat {
    int tahun;
    
    void menentukan_tahun_kabisat(){
        if(tahun % 4 == 0){
            System.out.println(tahun + " adalah tahun kabisat");
        }else{
            System.err.println(tahun + " bukan tahun kabisat");
        }
    }
}
