package praktikum.Tugas_2;

public class PersegiPanjang {
    float panjang;
    float lebar;
    
    void luasPersegiPanjang(){
        float luas_persegi_panjang = this.panjang * this.lebar;
        System.out.println("Luas persegi panjang dari P = " + this.panjang 
                            + " dan L = " + this.lebar 
                            + " adalah = " + luas_persegi_panjang);
    }
}
