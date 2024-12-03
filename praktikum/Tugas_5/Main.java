package praktikum.Tugas_5;
import java.util.Scanner;


public class Main {
    static void soal1(Scanner scanner, int[] bilangan){
        bilangan = new int[10];
        int max = bilangan[0];
        int min = bilangan[0];
        int i = 0;
        
        while( i < 10 ){
            System.out.print("Masukan bilangan ke " + (i+1) + " : ");
            bilangan[i] = scanner.nextInt(); 
            i++;
        }
                
        for( i = 0; i < 10; i++ ){
            if(bilangan[i] > max ){
                max = bilangan[i]; 
            }else if(bilangan[i] < min ){
                min = bilangan[i];
            }
        }
        
        System.out.println("Nilai Maksimalnya : " + max);
        System.out.println("Nilai Minimalnya : " + min);
    }
    static void soal2(Scanner scanner, int[] bilangan){             
        System.out.print("Tentukan Jumlah Bilangan : ");
        int jumlah_bilangan = scanner.nextInt();
        
        bilangan = new int[jumlah_bilangan];
        int sum = 0;
        
        for(int i = 0; i < jumlah_bilangan; i++){
            System.out.print("Masukan bilangan ke " + (i+1) + " : ");
            bilangan[i] = scanner.nextInt();
            sum += bilangan[i];
        }
        
        int average = sum/jumlah_bilangan;
        
        System.out.println("Total bilangannya : " + sum);
        System.out.println("rata-rata bilangannya : " + average);
    }
    static void soal3(Scanner scanner, int[] bilangan){
        System.out.print("Tentukan Banyak Baris : ");
        int banyak_baris = scanner.nextInt();
        int output = 1; 
        
        bilangan = new int[banyak_baris];
        for(int i = 0; i < banyak_baris; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(output + " ");
                output++;                
            }
           System.out.println();
        }
    }
    static void soal4(Scanner scanner){
        System.out.print("Tentukan jumlah angka ganjil : ");
        int jumlah_angka = scanner.nextInt();
        
        int total_ganjil = 0, i = 0, j = 1;
        System.out.print("angka ganjil : ");
        while ( i < jumlah_angka) {
            if(j % 2 == 1){
                System.out.print(j + " ");
                total_ganjil += j;
                i++;
            }
            j++;
        }
        System.out.println("\nTotal : " + total_ganjil);
    }
    static void soal5(Scanner scanner){
       int i = 0, j = 0, k = 0, l = 0;
       
       System.out.print("1) Half Triangle\n2) Full Triangle\nTentukan pilihanmu : ");
       int opt = scanner.nextInt();
        
        switch (opt) {
            case 1:
                while(i < 5){
                    j = 0;
                    k = 0;
                    l = 0;
                    while(j < 5-i){
                        System.out.print(" ");
                        j++;
                    }
                    while(k < i){
                        System.out.print("*");
                        k++;
                    }
                    while(l <= i){
                        System.out.print("*");
                        l++;
                    }
                    System.out.println("");
                    i++;
                }    break;
            case 2:
                int m = 0, n = 0, o = 0;
                while(i < 3){
                    j = 0;
                    k = 0;
                    l = 0;
                    while(j < 3-i){
                        System.out.print(" ");
                        j++;
                    }
                    while(k < i){
                        System.out.print("*");
                        k++;
                    }
                    while(l <= i){
                        System.out.print("*");
                        l++;
                    }
                    System.out.println("");
                    i++;
                }    i = 0;
                while( i < 2 ){
                    m = 0;
                    n = 0;
                    o = 0;
                    while(m < i+2){
                        System.out.print(" ");
                        m++;
                    }
                    while(n < 2-i){
                        System.out.print("*");
                        n++;
                    }
                    while(o < 1-i){
                        System.out.print("*");
                        o++;
                    }
                    System.out.println("");
                    i++;
                }    break;
            default:
                System.err.println("pilihan tidak ditemukan");
                break;
        }
       
        
    }
    static void soal6(){
        for (int i = 0; i < 10; i++) {
            if(i == 5 || i == 6){
                System.out.println("11");
            }
        }
    }
    static void soal7(){
        int val1 = 10, val2 = 10, num1 = 0, num2 = 0, i = 0;
        
        while(i < 5){
            num1 = ++val1;
            num2 = val2++;
            i++;
        }
        System.out.println(num1);
        System.out.println(num2);       
        
    }
    static void soal8(){
        int arr[] = {5, 4, 9, 1};
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bilangan = null;  
        
//        soal1(scanner, bilangan);
//        soal2(scanner, bilangan);
//        soal3(scanner, bilangan);
//        soal4(scanner);
        soal5(scanner);
        soal6();
        soal7();
        soal8();
    }
}
