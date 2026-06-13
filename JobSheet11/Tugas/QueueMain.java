import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QueueLinkedList antrian = new QueueLinkedList(10);

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Antrian Terdepan");
            System.out.println("5. Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs =
                            new Mahasiswa(nim, nama, kelas);

                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    System.out.println(
                            "Jumlah mahasiswa dalam antrian : "
                                    + antrian.getSize());
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 0);

        sc.close();
    }
}
