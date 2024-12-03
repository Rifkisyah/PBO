package praktikum.Tugas_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Percetakan percetakan = new Percetakan();
        
        System.out.print("Berapa novel : ");
        percetakan.jumlah_novel = scanner.nextInt();
        System.out.print("Berapa lembar pernovel : ");
        percetakan.jumlah_lembar = scanner.nextInt();
        
        percetakan.mesin_cetak();
    }
}


