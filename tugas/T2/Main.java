/*
    buatlah program java berdasarkan flowchart dibawah ini :
    https://drive.google.com/file/d/18DIHFGCRtyaPd5NmodEY1nd4dq1wnzz3/view?usp=sharing
 */
package tugas.T2;
import tugas.T2.TotalDetik;
import tugas.T2.LuasKeliling;
import tugas.T2.Luas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Luas luas = new Luas();
        LuasKeliling luas_keliling = new LuasKeliling();
        TotalDetik total_detik = new TotalDetik();
        
        System.out.print("pilih aktivitas :\n"
                + "1. Menghitung Luas bangun datar\n"
                + "2. Menghitung Luas Dan Keliling Lingkaran\n"
                + "3. menghitung Totsl Detik\n"
                + "Pilih Sesuai Nomor : ");
        int pilihanmu = input.nextInt();
        
        switch(pilihanmu){
            case 1 -> luas.menghitung_luas();
            case 2 -> {
                System.out.print("Masukan Nilai Jari-Jari : ");
                luas_keliling.jari_jari = input.nextFloat();
                luas_keliling.menghitung_luas_dan_keliling_lingkaran();
            }
            case 3 -> {
                System.out.print("Masukan jumlah Jam : ");
                total_detik.jam = input.nextInt();
                System.out.print("Masukan jumlah menit : ");
                total_detik.menit = input.nextInt();
                System.out.print("Masukan jumlah detik : ");
                total_detik.detik = input.nextInt();
                total_detik.menghitung_total_detik();
            }
            default -> System.err.println("invalid! tidak ditemukan pilihan.");
        }
    }
}
