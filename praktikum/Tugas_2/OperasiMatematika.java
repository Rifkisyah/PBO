package praktikum.Tugas_2;

public class OperasiMatematika {
    int x;
    int y;
    
    void penjumlahan(){
        int penjumlahan = this.y + this.x;
        System.out.println("hasil penjumlahan dari " + this.x + " + " + this.y + " = " + penjumlahan);
    }
    void pengurangan(){
        int pengurangan = this.y - this.x;
        System.out.println("hasil penjumlahan dari " + this.x + " - " + this.y + " = " + pengurangan);
    }
    void perkalian(){
         int perkalian = this.y * this.x;
        System.out.println("hasil penjumlahan dari " + this.x + " * " + this.y + " = " + perkalian);
    }
    void pembagian(){
        int pembagian = this.y / this.x;
        System.out.println("hasil penjumlahan dari " + this.x + " / " + this.y + " = " + pembagian);
    }
}
