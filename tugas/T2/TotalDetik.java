package tugas.T2;

public class TotalDetik {
    int jam, menit, detik, total_detik;
    
    void menghitung_total_detik(){
        System.out.println("\nDiketahui\n"
                + "Jam = " + this.jam + "\n"
                + "Menit = " + this.menit + "\n"
                + "Detik = " + this.detik);
        this.total_detik = this.jam * 3600 + this.menit * 60 + this.detik;
        System.out.println("\nMaka\nTotal Detiknya = " + this.total_detik); 
    }
}
