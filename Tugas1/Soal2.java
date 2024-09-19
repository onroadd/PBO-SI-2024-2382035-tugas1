package Tugas1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan ukuran tangga (n)");
        int n = scanner.nextInt();
        cetakTangga(n);

    }

    public static void cetakTangga(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + "#");
            }

            System.out.println();
        }
    }
}
