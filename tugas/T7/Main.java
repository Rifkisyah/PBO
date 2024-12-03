package tugas.T7;

public class Main {
    public static void main(String[] args) {
        BangunDatar p = new Persegi(2);
        BangunDatar l = new Lingkaran(2);
        BangunDatar pp = new PersegiPanjang(2, 2);
        BangunDatar s = new Segitiga(2, 2, 2);      
        
        System.out.println("Luas Persegi : " + p.getLuas());
        System.out.println("keliling Persegi : " + p.getKeliling());
        System.out.println("");
        System.out.println("Luas Lingkaran : " + l.getLuas());
        System.out.println("Keliling Lingkaran : " + l.getKeliling());
        System.out.println("");
        System.out.println("Luas Persegi Panjang : " + pp.getLuas());
        System.out.println("Keliling Persegi Panjang : " + pp.getKeliling());
        System.out.println("");
        System.out.println("Luas Segitiga : " + s.getLuas());
        System.out.println("Keliling Segitiga : " + s.getKeliling());
  
    }
}
