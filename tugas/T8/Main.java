package tugas.T8;

public class Main {
    public static void main(String[] args) {
        BangunDatar p = new Persegi(2);
        BangunDatar l = new Lingkaran(2);
        BangunDatar pp = new PersegiPanjang(2, 2);
        BangunDatar s = new Segitiga(2, 2, 2);      
        
        System.out.println("Luas Persegi : " + p.luas());
        System.out.println("keliling Persegi : " + p.keliling());
        System.out.println("");
        System.out.println("Luas Lingkaran : " + l.luas());
        System.out.println("Keliling Lingkaran : " + l.keliling());
        System.out.println("");
        System.out.println("Luas Persegi Panjang : " + pp.luas());
        System.out.println("Keliling Persegi Panjang : " + pp.keliling());
        System.out.println("");
        System.out.println("Luas Segitiga : " + s.luas());
        System.out.println("Keliling Segitiga : " + s.keliling());
  
    }
}
