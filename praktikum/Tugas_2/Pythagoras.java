package praktikum.Tugas_2;

public class Pythagoras extends Segitiga {
    int c;
    
    void mencari_nilai_c_pada_Segitiga(){
        this.c = (int) Math.sqrt((a * a) + (b * b));
        System.out.println("memakai pytaghoras maka\na = " + a + "\nb = " + b + "\nc = " + this.c);
    }
    
    void keliling_segitiga(){
        int keliling = a + b + this.c;
        System.out.println("maka kelilingnya = " + keliling);
    }
}
