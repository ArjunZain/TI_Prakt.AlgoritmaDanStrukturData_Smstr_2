package JobSheet3;

import java.util.Scanner;
public class MahasiswaDemo05 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       Mahasiswa05[] mahasiswa = new Mahasiswa05[3];
       String dummy;

for(int i=0; i < 3; i++) {
    mahasiswa[i] = new Mahasiswa05();

    System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
    System.out.print("NIM  : ");
    mahasiswa[i].nim = sc.nextLine();
    System.out.print("Nama : ");
    mahasiswa[i].nama = sc.nextLine();
    System.out.print("Kelas : ");
    mahasiswa[i].kelas = sc.nextLine();
    System.out.print("IPK : ");
    dummy = sc.nextLine();
    mahasiswa[i].ipk = Float.parseFloat(dummy);
    System.out.println("-------------------------------");
}

        for(int i=0; i < 3; i++) {
    System.out.println("Data Mahasiswa ke-" + (i + 1));
    System.out.println("NIM   : " + mahasiswa[i].nim);
    System.out.println("Nama  : " + mahasiswa[i].nama);
    System.out.println("Kelas : " + mahasiswa[i].kelas);
    System.out.println("IPK   : " + mahasiswa[i].ipk);
    System.out.println("------------------------------------");
}
    }
}