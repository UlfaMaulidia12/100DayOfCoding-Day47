package ProgramDay;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========DAFTAR NILAI MAHASISWA ========");
        // Input nama mahasiswa
        System.out.print("Masukkan nama mahasiswa\t: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.println("Selamat datang, " + namaMahasiswa + "!");

        // Input nilai mahasiswa
        System.out.print("Masukkan nilai mahasiswa\t: ");
        double nilaiMahasiswa = scanner.nextDouble();

        // Menampilkan nilai mahasiswa
        System.out.println("Nilai mahasiswa untuk " + namaMahasiswa + " adalah: " + nilaiMahasiswa);

        // Menentukan status kelulusan
        if (nilaiMahasiswa >= 60) {
            System.out.println(namaMahasiswa + " dinyatakan LULUS.");
        } else {
            System.out.println(namaMahasiswa + " dinyatakan TIDAK LULUS.");
        }
    }
}
