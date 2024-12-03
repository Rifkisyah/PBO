package tugas.T2;

public class Luas {
    float panjang = 2f;
    float lebar = 5f;
    float luas;
    
    void menghitung_luas(){
        System.out.println("\ndiketahui\n"
                + "Panjang = " + this.panjang + "\n"
                + "Lebar = " + this.lebar);
        this.luas = this.panjang * this.lebar;
        System.out.println("\nMaka\nLuasnya adalah = " + this.luas);
    }
}
