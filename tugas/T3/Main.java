/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.T3;
import java.util.Scanner;

/**
 *
 * @author rifki
 */
public class Main {
    static boolean condition = true;
    static void bersepeda(Sepeda sepeda1, Scanner in){
        
        
        System.out.print("Menu\n1. bergerak maju\n2. bergerak mundur\n3. berhenti\n0. keluar\n masukan Pilihanmu : ");
        int opsi = in.nextInt();
    
        switch(opsi){
            case 1 -> sepeda1.melaju(); 
            case 2 -> sepeda1.mundur();
            case 3 -> sepeda1.berhenti();
            case 0 -> condition = false;
            default -> System.err.println("input tidak ditemukan!");
        }
    }
    
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan Merek Sepedamu : ");
        sepeda1.merek = in.nextLine();
                
        while(condition == true){           
            bersepeda(sepeda1, in);
        }
        System.out.println("keluar dari program...\nTerima kasih telah memakai program ini!");
        
    }
    
}
