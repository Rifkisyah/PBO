/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;

public class GenapAtauGanjil {
    int bilangan;
 
    void info(){
        if(bilangan % 2 == 0){
            System.out.println(this.bilangan + " adalah genap");
        }else{
            System.out.println(this.bilangan + " adalah ganjil");
        }
    }
}
