import java.util.Scanner;

public class DoubleLinkedListMain05 {

    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa05 inputMahasiswa() {

        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa05(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {

        DoubleLinkedList05 list =
                new DoubleLinkedList05();

        int pilih;

        do {
            System.out.println("\n===== DOUBLE LINKED LIST =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Print");
            System.out.println("5. Print Reverse");
            System.out.println("6. Remove First");
            System.out.println("7. Remove Last");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    list.addFirst(inputMahasiswa());
                    break;

                case 2:
                    list.addLast(inputMahasiswa());
                    break;

                case 3:
                    System.out.print(
                            "Masukkan NIM yang dicari : ");
                    String key = sc.nextLine();

                    System.out.println(
                            "Data yang akan disisipkan");
                    list.insertAfter(
                            key,
                            inputMahasiswa());
                    break;

                case 4:
                    list.print();
                    break;

                case 5:
                    list.printReverse();
                    break;

                case 6:
                    list.removeFirst();
                    break;

                case 7:
                    list.removeLast();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);
    }
}
