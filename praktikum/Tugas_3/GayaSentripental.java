package praktikum.Tugas_3;

public class GayaSentripental {
    /* F = gaya sentripental (N),
    M = massa benda (kg),
    V = kecepatan linear benda (m/s),
    R = jari jari lintasan melingkar (m)
    */
    double F, M, V, R;
    
    void menghitung_gaya_sentripental(){
        this.F = (this.M * (this.V * this.V)) / this.R; 
        System.out.println("Gaya sentripental : " + this.F);
    }
}
