import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data pegawai tetap:");
        System.out.print("Nama: ");
        String namaTetap = scanner.nextLine();
        System.out.print("No. KTP: ");
        String ktpTetap = scanner.nextLine();
        System.out.print("Upah: ");
        double upahTetap = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan buffer

        System.out.println("\nMasukkan data pegawai harian:");
        System.out.print("Nama: ");
        String namaHarian = scanner.nextLine();
        System.out.print("No. KTP: ");
        String ktpHarian = scanner.nextLine();
        System.out.print("Upah per Jam: ");
        double upahPerJam = scanner.nextDouble();
        System.out.print("Total Jam Kerja: ");
        int totalJam = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        System.out.println("\nMasukkan data sales:");
        System.out.print("Nama: ");
        String namaSales = scanner.nextLine();
        System.out.print("No. KTP: ");
        String ktpSales = scanner.nextLine();
        System.out.print("Total Penjualan: ");
        int penjualan = scanner.nextInt();
        System.out.print("Besaran Komisi: ");
        double komisi = scanner.nextDouble();

        Pegawai pegawai1 = new PegawaiTetap(namaTetap, ktpTetap, upahTetap);
        Pegawai pegawai2 = new PegawaiHarian(namaHarian, ktpHarian, upahPerJam, totalJam);
        Pegawai pegawai3 = new Sales(namaSales, ktpSales, penjualan, komisi);

        System.out.println("\nInformasi Pegawai:");
        System.out.println("Pegawai Tetap:");
        System.out.println("No. KTP: " + ktpTetap);
        System.out.println("Upah: " + upahTetap);
        System.out.println("Pendapatan: " + pegawai1.gaji());
        System.out.println();

        System.out.println("Pegawai Harian:");
        System.out.println("No. KTP: " + ktpHarian);
        System.out.println("Upah/Jam: " + upahPerJam);
        System.out.println("Total Jam Kerja: " + totalJam);
        System.out.println("Pendapatan: " + pegawai2.gaji());
        System.out.println();

        System.out.println("Sales:");
        System.out.println("No. KTP: " + ktpSales);
        System.out.println("Total Penjualan: " + penjualan);
        System.out.println("Besaran Komisi: " + komisi);
        System.out.println("Pendapatan: " + pegawai3.gaji());

        scanner.close();
    }
}