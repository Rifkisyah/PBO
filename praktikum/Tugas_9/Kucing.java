/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_9;

/**
 *
 * @author jarkom-2
 */
public class Kucing extends Hewan {
    Kucing(String nama){
        super(nama);
    }
    
    @Override
    String display(){
        return this.nama;
    }
}
