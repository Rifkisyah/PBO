package praktikum.Tugas_2;

public class Segitiga {
    int a;
    int b;
    
    void luas_segitiga(){
        int luas_segitiga = (int) (0.5 * this.a * this.b);
        System.out.println("luas segitiga dari\na = " + this.a + "\nb = " + this.b + "\nadalah = " + luas_segitiga);
    }
}
