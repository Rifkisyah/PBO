/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;

public class RecursiveExample {
    int num = 0;
    
    public void methodRecursive(){
        this.num +=1;
        if(this.num <=5){
            System.out.println("angka " + this.num);
            methodRecursive();
        }else{
            System.out.println("progream stopped");
        }
    }
}
