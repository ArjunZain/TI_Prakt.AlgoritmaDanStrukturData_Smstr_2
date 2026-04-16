package JobSheet4;

import java.util.Scanner;

public class FaktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int n = sc.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Hasil Faktorial BF: " + fk.faktorialBF(n));
        System.out.println("Hasil Faktorial DC: " + fk.faktorialDC(n));
    }
}