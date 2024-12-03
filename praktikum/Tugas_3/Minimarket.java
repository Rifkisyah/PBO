package praktikum.Tugas_3;

public class Minimarket {
    int buah_mangga, buah_jambu;
    
    
    void pengembalian(int buah_mangga, int buah_jambu){
        this.buah_mangga =- buah_mangga; 
        this.buah_jambu =- buah_jambu;
        System.out.println("pengembalian buah mangga : " + buah_mangga + " \npengembalian buah jambu : " + buah_jambu);
    }
}
