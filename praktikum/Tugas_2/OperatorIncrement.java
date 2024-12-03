/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_2;

public class OperatorIncrement {
    int post_increment;
    int pre_increment;
    
    void postIncrement(int i){
        this.post_increment = i++;
        System.out.println("nilainya akan menghasilkan " + this.post_increment);
    }
    
    void preIncrement(int i){
        pre_increment = ++i;
        System.out.println("nilainya akan menghasilkan " + this.pre_increment);
    }
}
