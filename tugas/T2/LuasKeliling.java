package tugas.T2;

public class LuasKeliling {
    float jari_jari, keliling, luas;
    final float pi = 3.14f;
    
    void menghitung_luas_dan_keliling_lingkaran(){
        System.out.println("\nDiketahui\n"
                + "Jari-jari = " + this.jari_jari + "\n"
                + "pi = " + this.pi);
        this.luas = this.pi * this.jari_jari * this.jari_jari;
        this.keliling = 2 * this.pi * this.jari_jari;
        System.out.println("\nMaka\nLuas Lingkaran = " + this.luas + "\nKeliling Lingkaran = " + this.keliling);
    }    
}
