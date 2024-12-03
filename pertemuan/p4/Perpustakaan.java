/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.p4;

/*
 *
 * @author rifki
 */
public class Perpustakaan {
    int id;
    String name;
    boolean torf;
    
    public Perpustakaan(int id, String name, boolean torf){
        this.id = id;
        this.name = name;
        this.torf = torf;
        
        
    }
            
    void printout(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(torf);
    }
}