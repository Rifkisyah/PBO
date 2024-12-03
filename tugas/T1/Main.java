/*
    Buat program inputan pada java sehingga ketika dijalankan menghasilkan program berikut ini:

    Masukan Tahun (1909 - 2024) : 1996
    1996 adalah tahun kabisat
 */
package tugas.T1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Tahun (1909 - 2024) : ");
        int tahun = input.nextInt();
              
        if (tahun % 4 == 0) {
            System.out.println(tahun + " merupakan tahun kabisat");
        } else {
            System.out.println(tahun + " bukan merupakan tahun kabisat");
        }
        
    }
}
