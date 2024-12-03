/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.T3;

/**
 *
 * @author rifki
 */
public class Sepeda {
    String merek;
    int jarak_tempuh = 0;
        
    void melaju(){
        this.jarak_tempuh += 10;
        System.out.println("sepeda " + this.merek + " telah bergerak maju 10 Km\nsepeda " + this.merek + " telah menempuh jarak " + this.jarak_tempuh + " Km");
    }
    void mundur(){
        this.jarak_tempuh -= 5;
        System.out.println("sepeda " + this.merek + " telah bergerak mundur 5 Km\nsepeda " + this.merek + " telah menempuh jarak " + this.jarak_tempuh + " Km");
    }
    void berhenti(){
        System.out.println("sepeda " + this.merek + " telah berhenti\njarak yang ditempuhnya " + this.jarak_tempuh + " km" );
        this.jarak_tempuh = 0;
    }
}
