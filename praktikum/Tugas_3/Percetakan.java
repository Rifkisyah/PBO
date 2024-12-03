package praktikum.Tugas_3;

public class Percetakan {
    int jumlah_novel, jumlah_lembar;
    int hari = 86400, jam = 3600, menit = 60;
    
    void mesin_cetak(){
        int waktu_cetak_perlembar = 1;
        int lama_waktu_cetak_novel = waktu_cetak_perlembar * this.jumlah_lembar * this.jumlah_novel;
        int perhari = lama_waktu_cetak_novel / this.hari;
        int sisa_detik_hari = lama_waktu_cetak_novel % this.hari;
        int perjam = sisa_detik_hari / this.jam;
        int sisa_detik_jam = sisa_detik_hari % this.jam;
        int permenit = sisa_detik_jam / this.menit;
        int sisa_detik = sisa_detik_jam % this.menit;
        System.out.println("Jadi, lama waktu pembuatan " + this.jumlah_novel + " novel adalah sekitar: \n" +
                perhari + " hari\n" + perjam + " jam\n" + permenit + " menit\n" + sisa_detik + " detik");
    }
}
