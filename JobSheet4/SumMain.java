package JobSheet4;

import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Keuntungan bulan ke-" + (i+1) + ": ");
            data[i] = sc.nextInt();
        }

        Sum sm = new Sum(data);

        System.out.println("\nTotal BF: " + sm.totalBF());
        System.out.println("Total DC: " + sm.totalDC(0, n - 1));
    }
}