/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_10;

/**
 *
 * @author rifki
 */
public class PersegiPanjang extends Bentuk{
    int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    void luas(){
        this.luas = this.panjang * this.lebar;
        System.out.println("Luas Persegi panjang : " + this.luas);
    }
}
