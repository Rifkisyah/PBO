/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.p8;

/**
 *
 * @author rifki
 */
public class EncasulapsyMahasiswa {
    private int npm;
    private String nama;

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNpm() {
        return npm;
    }
    
    
    
    public EncasulapsyMahasiswa(int npm, String nama){
        this.npm = npm;
        this.nama = nama;
    }
    
    public void info (){
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
    }
   
    
}
