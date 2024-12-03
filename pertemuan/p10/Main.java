package pertemuan.p10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void checkNegativeNumber(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Angka tidak boleh negatif.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean process = false;

        while (!process) {
            try {
                System.out.print("Input angka pertama: ");
                num1 = scanner.nextInt();
                checkNegativeNumber(num1);

                System.out.print("Input angka kedua: ");
                num2 = scanner.nextInt();
                checkNegativeNumber(num2);

                int result = num1 / num2;
                System.out.println("Hasil pembagian: " + result);

                process = true; // Exit the loop when successful

            } catch (ArithmeticException e) {
                System.err.println("Kesalahan: Pembagian dengan angka nol tidak diperbolehkan.");
            } catch (InputMismatchException e) {
                System.err.println("Kesalahan: Input harus berupa angka.");
                scanner.nextLine(); // Clear invalid input
            } catch (IllegalArgumentException e) {
                System.err.println("Kesalahan: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Kesalahan tidak terduga: " + e.getMessage());
            }

            System.out.println("Silakan coba lagi.\n"); // Guide user to retry
        }

        System.out.println("Program selesai.");
        scanner.close();
    }
}
