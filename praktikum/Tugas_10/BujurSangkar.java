/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_10;

/**
 *
 * @author rifki
 */
public class BujurSangkar extends Bentuk {
    int s;

    public BujurSangkar(int s) {
        this.s = s;
    }
    
    @Override
    void luas(){
        this.luas = this.s * this.s;
        System.out.println("luas bujur sankgar : " + this.luas);
    }
}
