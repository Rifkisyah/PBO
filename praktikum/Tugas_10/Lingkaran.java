/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_10;

/**
 *
 * @author rifki
 */
public class Lingkaran extends Bentuk{
    float phi = 3.14f;
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }
    
    @Override
    void luas(){
        this.luas = (int)(this.phi * this.r * this.r);
        System.out.println("luas dari lingkaran : " + this.luas);
    }
}
