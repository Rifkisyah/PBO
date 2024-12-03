package praktikum.Tugas_2;

public class KecepatanCahaya {
    double bumi_ke_bulan = 384400;
    double bumi_ke_matahari = 152100000;
    double kecepatan_cahaya = 300000;
    
    void waktu_tempuh(){
        float waktu_tempuh1 = (float) (this.bumi_ke_bulan / this.kecepatan_cahaya);
        double waktu_tempuh2 = this.bumi_ke_matahari / this.kecepatan_cahaya;
        
        System.out.println("waktu tempuh bumi ke bulan adalah " + waktu_tempuh1 + " km");
        System.out.println("waktu tempuh bumi ke matahari adalah " + waktu_tempuh2 + " jt km");
    }
}
