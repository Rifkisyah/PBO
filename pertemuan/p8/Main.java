/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.p8;

class Hewan{
    protected void bersuara(){
        System.out.println("hewan bersuara...");
    }
}

class Kucing extends Hewan{
    @Override 
    protected void bersuara(){
        System.out.println("kucing mengeong");
    }
}

class Anjing extends Hewan{
    @Override 
    protected void bersuara(){
        System.out.println("anjing mengonggong");
    }
}


public class Main {
    public static void main(String[] args) {
        EncasulapsyMahasiswa m = new EncasulapsyMahasiswa(107, "rifki");
        m.info();
        m.setNama("udin");
        m.info();
        int _npm = m.getNpm();
        System.out.println(_npm);
        
    }
}
