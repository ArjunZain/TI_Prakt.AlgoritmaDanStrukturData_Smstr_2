import java.util.Scanner;

public class SLLMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();

        System.out.println("=== INPUT DATA MAHASISWA ===");

        for (int i = 1; i <= 4; i++) {

            System.out.println("\nData Mahasiswa ke-" + i);

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }

        System.out.println("\nData dalam Linked List:");
        sll.print();

        sc.close();
    }
}
