/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;

public class BangunDatar {
    int menu, s, a, t, r, b1, b2, d1, d2;
    float phi = 3.14f;  
    
    void nilaiDihitung(){
        switch(menu){
            case 1 -> {
                 int luas_persegi = this.s * this.s; 
                 System.out.println("luas persegi = " + luas_persegi);
            }
            case 2 -> {
                 int luas_segitiga = (int) (0.5 * this.a * this.t); 
                 System.out.println("luas segitiga = " + luas_segitiga);
            }
            case 3 -> { 
                 int luas_lingkaran = (int) (this.phi * (this.r * this.r)); 
                 System.out.println("luas lingkaran = " + luas_lingkaran);
            }
            case 4 -> { 
                 int luas_trapesium = (int) (0.5 * (this.b1 + this.b2) * this.t); 
                 System.out.println("luas trapesium = " + luas_trapesium);
            }
            case 5 -> {
                 int luas_layang_layang = (int) (0.5 * this.d1 * this.d2); 
                 System.out.println("luas layang layang = " + luas_layang_layang);
            }
            default -> {System.err.println("menu tidak tersedia");}
        }
    }
}
