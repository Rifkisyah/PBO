package praktikum.Tugas_8;
import java.util.Scanner;

public class Main {
    static void soal1(Scanner input) {
        System.out.print("Factorial Dari: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Faktorial " + n + " tidak tersedia");
        } else if (n == 0) {
            System.out.println("Faktorial " + n + " adalah 1");
        } else {
            int totalFaktorial = 1;

            for (int i = 1; i <= n; i++) {
                totalFaktorial *= i;
            }

            System.out.println("Faktorial: " + totalFaktorial);
        }
    }
    
    static void soal2(Scanner input){
        System.out.print("Tentukan Bilangan : ");
        int n = input.nextInt();
        
        System.out.print("Tentukan Jumlah Pangkat : ");
        int r = input.nextInt();
        
        int totalPangkat = 1;
        
        for(int i = 0; i < r; i++){
            totalPangkat *= n;
        }
        
        System.out.println("Total Nilai : " + totalPangkat);
    }
    
    static void soal3(Scanner input){
        System.out.print("Tentukan Bilangan Desimal : ");
        int n = input.nextInt();
        
        if(n < 0){
            n = n - n + n;
        }
        
        int temp = n;
        int binerSize = 0;
        while (temp > 0) {
            binerSize++;
            temp /= 2;
        }
        
        int[] biner = new int[binerSize];
        int i = binerSize - 1;
        
        while(n > 0){
            biner[i] = n % 2;
            n /= 2;
            i--;
        }
        
        System.out.print("nilai biner : ");
        for (int ii : biner) {
            System.out.print(ii);
        }
        System.out.println("");
        
    }
    
    static void soal4(){
        Kasir toko1 = new Kasir(5000);
        Kasir toko2 = new Kasir(5000, 10);
        Kasir toko3 = new Kasir(5000, 10, 10000);
    }
    
    static void soal5(){
        Bidang bidang = new Bidang(4, 8, 5, 10);
        bidang.luasBidangHitam();
    }
    
    static void soal6(){
        Mahasiswa univ1 = null;
        for (int i = 0; i < 10; i++) {
            univ1 = new Mahasiswa(15+i);
        }
        System.out.println("Rata-Rata Umur kelulusan Mahasiswa Adalah " + univ1.rataRataUmurKelulusan());
    }
    
    static void soal7(){
        int[] n = {6, 12, 24, 48, 96};
        modify(n);
        System.out.print("after modify : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(n[i] + " ");
        }
    }
    
    static void modify(int[] n){
        n = new int[]{1, 2, 3, 4, 5};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        soal1(scanner);        
        soal2(scanner);        
        soal3(scanner);        
        soal4();        
        soal5();        
        soal6();        
        soal7();        
    }
}
