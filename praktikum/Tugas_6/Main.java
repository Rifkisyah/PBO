package praktikum.Tugas_6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void soal3(Scanner scanner) {
        // a
        System.out.print("Tentukan  jumlah elemen array : ");
        int index = scanner.nextInt();
        System.out.println("");
        // b 
        int[] arr = new int[index];
        for (int i = 0; i < index; i++) {
            System.out.print("Masukan nilai dari elemen ke-" + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("");
        // c
        int min = arr[0], max = arr[0], index_value_max = 0, index_value_min = 0;
        for (int i = 0; i < index; i++) {
            if(arr[i] > max){
                max = arr[i];
                index_value_max = i;
            }else if(arr[i] < min){
                min = arr[i];
                index_value_min = i;
            }
        }
        System.out.println("bilangan terbesar adalah : " + max + " yang berada pada posisi index ke " + index_value_max);
        System.out.println("bilangan terkecil adalah : " + min + " yang berada pada posisi index ke " + index_value_min);
        System.out.println("");
        // d
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }
        int average = sum/index;
        System.out.println("total datanya " + sum + " dengan rata rata " + average);
        System.out.println("");
        // f (NPM Ganjil)
        int genap = 0;
        for (int i = 0; i < index; i++) {
            if(i % 2 == 0){
                genap += arr[i];
            }
        }
        System.out.println("total elemen dari index genap adalah " + genap);
        System.out.println("");
        // g
        if(genap % 2 == 0 ){
            System.out.println("hasil penjumlahan genap");
        }else if(genap % 2 == 1){
            System.out.println("hasil penjumlahan ganjil");
        }
        System.out.println("");
        // h
        System.out.print("elemen array di urutkan : ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    static void soal4(Scanner scanner) {
        System.out.print("Tentukan jumlah mahasiswa: ");
        int jumlah_mhs = scanner.nextInt();
        scanner.nextLine(); 
        
        ArrayList<ArrayList<Object>> tabel_mhs = new ArrayList<>();
        String nama, status;
        int nilai;
               
        for (int i = 0; i < jumlah_mhs; i++) {
            System.out.print("Masukan Nama Mahasiswa: ");
            nama = scanner.nextLine();
            System.out.print("Masukan Nilai Mahasiswa: ");
            nilai = scanner.nextInt();
            scanner.nextLine(); 
            
            if (nilai <= 50) {
                status = "tidak lulus";
            } else {
                status = "lulus";
            }
                      
            ArrayList<Object> row = new ArrayList<>();
            row.add(i + 1); 
            row.add(nama);  
            row.add(nilai); 
            row.add(status); 
            tabel_mhs.add(row);
        }

        System.out.println("___________________________________________");
        System.out.println("| No |      Nama      | Nilai |   Status   |");
        System.out.println("___________________________________________");

        for (ArrayList<Object> row : tabel_mhs) {
            System.out.printf("| %-2d | %-13s | %-5d | %-10s |\n", 
                row.get(0), row.get(1), row.get(2), row.get(3));
        }
        System.out.println("___________________________________________");
    }
    
    static void soal5(Scanner scanner){
        System.out.print("Tentukan jumlah baris : ");
        int row = scanner.nextInt();
        System.out.print("Tentukan jumlah kolom : ");
        int col = scanner.nextInt();
        
        int[][] matrix = new int[row][col];
        Random random = new Random();
        int total_value = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = random.nextInt(100);
                total_value += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total matriks : " + total_value);
    }
    
    static void soal6(Scanner scanner){
        try{
            int length = 5;
            int[] number = new int[length];
            int total = 0;
                        
            System.out.println("Masukan Bilangan");
            for (int i = 0; i < length; i++) {
                System.out.print("bilangan ke-" + (i+1) + " : ");
                number[i] = scanner.nextInt();
                total += number[i];
            }
            
            int average = total / length;
            System.out.println("Rata rata dari bilangan : " + average);
            
        } catch (Exception e) {
            System.err.println("Bilangan harus bernilai Integer!");
        }
    }
    
    static void soal7(){
        MultiThreadExample t = new MultiThreadExample();
        t.start();
    }
    
    static void soal8(Scanner scanner){
        System.out.print("tentukan berapa jumlah thread di inginkan : ");
        int call = scanner.nextInt();
        
        for (int i = 0; i < call; i++) {
            MultiThreadExample t = new MultiThreadExample();
            t.start();
        }
    }
    
    static void soal10(){
        ArrayList<Object> arrData = new ArrayList<>();
        
        arrData.add(0, 19);
        arrData.add(1, 0.2);
        arrData.add(2, 'C');
        arrData.add(3, "Java");
        arrData.add(4, true);
        
        for (int i = 0; i < arrData.size(); i++) {
            System.out.println(arrData.get(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        soal3(scanner);
        System.out.println("");
        soal4(scanner);
        soal5(scanner);
        soal6(scanner);
        soal7();
        soal8(scanner);
        soal10();
    }
}
