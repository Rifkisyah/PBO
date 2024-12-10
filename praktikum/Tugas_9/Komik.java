package praktikum.Tugas_9;

public class Komik extends Produk {
    int jumlah_halaman;
    
    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }
    public Komik(String judul, String penulis, int jumlah_halaman) {
        super(judul, penulis);
        this.jumlah_halaman = jumlah_halaman;
    }
    
    @Override
    void getInfoProduk(){
        if(jumlah_halaman != 0){
            System.out.println("judul : " + this.judul);
            System.out.println("penulis : " + this.penulis);
            System.out.println("Jumlah halaman : " + this.jumlah_halaman + " lembar");
        } else {
            System.out.println("judul : " + this.judul);
            System.out.println("penulis : " + this.penulis);
        }
        
    }
}
