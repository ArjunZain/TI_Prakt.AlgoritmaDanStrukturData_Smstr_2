package JobSheet1;
//TUGAS 2

import java.util.Scanner;

public class JadwalKuliah {

    static Scanner sc = new Scanner(System.in);
    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang             : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah       : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah        : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== TABEL JADWAL KULIAH ===");
        System.out.println("MK\t\tRuang\tHari\tJam");

        for (int i = 0; i < n; i++) {
            System.out.println(
                jadwal[i][0] + "\t" +
                jadwal[i][1] + "\t" +
                jadwal[i][2] + "\t" +
                jadwal[i][3]
            );
        }
    }

    static void tampilHari(String[][] jadwal, int n) {
        System.out.print("\nMasukkan hari yang dicari : ");
        String hari = sc.nextLine();
        System.out.println("\n=== JADWAL HARI " + hari + " ===");
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(
                    jadwal[i][0] + "\t" +
                    jadwal[i][1] + "\t" +
                    jadwal[i][2] + "\t" +
                    jadwal[i][3]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut!");
        }
    }

    static void tampilMatkul(String[][] jadwal, int n) {
        System.out.print("\nMasukkan nama mata kuliah : ");
        String mk = sc.nextLine();
        System.out.println("\n=== JADWAL MATA KULIAH " + mk + " ===");
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(
                    jadwal[i][0] + "\t" +
                    jadwal[i][1] + "\t" +
                    jadwal[i][2] + "\t" +
                    jadwal[i][3]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan!");
        }
    }

    public static void main(String[] args) {

        System.out.print("Jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());
        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal, n);

        System.out.println("\n=== MENU ===");
        System.out.println("1. Tampilkan semua jadwal");
        System.out.println("2. Tampilkan jadwal berdasarkan hari");
        System.out.println("3. Tampilkan jadwal berdasarkan mata kuliah");
        System.out.print("Pilih menu: ");
        int menu = Integer.parseInt(sc.nextLine());

        if (menu == 1) {
            tampilSemua(jadwal, n);
        } else if (menu == 2) {
            tampilHari(jadwal, n);
        } else if (menu == 3) {
            tampilMatkul(jadwal, n);
        } else {
            System.out.println("Menu tidak valid!");
        }
    }
}
