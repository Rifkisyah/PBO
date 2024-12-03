package praktikum.Tugas_3;

public class DetailBelanja {
    String nama;
    double total_belanja, diskon, total_setelah_diskon, total_bayar, kembalian;
    
    void total_setelah_diskon(){
        this.total_setelah_diskon = this.total_belanja - (this.total_belanja * diskon/100);
    }
    void kembalian(){
        this.kembalian = this.total_bayar - this.total_setelah_diskon;
    }
}
