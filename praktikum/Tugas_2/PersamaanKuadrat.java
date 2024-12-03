package praktikum.Tugas_2;

public class PersamaanKuadrat {
    int a;
    int b;
    int c;
            
    void persamaan_kuadrat(){
        int persamaan_kuadrat = (this.b * this.b) - (4 * this.a * this.c);
        System.out.println("persamaan kuadrat dari a = " + this.a 
                            + " b = " + this.b 
                            + " c = " + this.c  
                            + " adalah " + persamaan_kuadrat);
    }
}
