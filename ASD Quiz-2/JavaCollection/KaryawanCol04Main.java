package JavaCollection;
import java.util.Scanner;

public class KaryawanCol04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KaryawanServiceCol04 service = new KaryawanServiceCol04();

        while (true) {
            System.out.println("\n===============================================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Akses Karyawan");
            System.out.println("4. Cetak Semua Karyawan");
            System.out.println("5. Urutkan Karyawan berdasarkan Nama");
            System.out.println("6. Cari Karyawan berdasarkan Nama");
            System.out.println("7. Keluar");
            System.out.println("===============================================");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("\nTambah Karyawan");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Masukkan ID Karyawan: ");
                    String idKaryawan = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir: ");
                    String tanggalLahir = scanner.nextLine();
                    service.tambahKaryawan(new KaryawanCol04(idKaryawan, nama, tanggalLahir));
                    System.out.println("\nKaryawan berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\nHapus Karyawan");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Masukkan ID Karyawan yang akan dihapus: ");
                    idKaryawan = scanner.nextLine();
                    service.hapusKaryawan(idKaryawan);
                    System.out.println("\nKaryawan dengan ID " + idKaryawan + " berhasil dihapus.");
                    break;
                case 3:
                    System.out.println("\nAkses Karyawan");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Masukkan ID Karyawan yang akan diakses: ");
                    idKaryawan = scanner.nextLine();
                    KaryawanCol04 karyawan = service.aksesKaryawan(idKaryawan);
                    if (karyawan != null) {
                        System.out.println("\nDetail Karyawan:");
                        System.out.println(karyawan);
                    } else {
                        System.out.println("\nKaryawan dengan ID " + idKaryawan + " tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("\nCetak Semua Karyawan");
                    System.out.println("-----------------------------------------------");
                    service.cetakSemuaKaryawan();
                    break;
                case 5:
                    System.out.println("\nUrutkan Karyawan berdasarkan Nama");
                    System.out.println("-----------------------------------------------");
                    service.urutkanKaryawan();
                    System.out.println("\nDaftar karyawan telah diurutkan:");
                    service.cetakSemuaKaryawan();
                    break;
                case 6:
                    System.out.println("\nCari Karyawan berdasarkan Nama");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Masukkan nama karyawan yang akan dicari: ");
                    nama = scanner.nextLine();
                    KaryawanCol04 hasilCari = service.cariKaryawan(nama);
                    if (hasilCari != null) {
                        System.out.println("\nKaryawan ditemukan:");
                        System.out.println(hasilCari);
                    } else {
                        System.out.println("\nKaryawan dengan nama '" + nama + "' tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.println("\nKeluar");
                    System.out.println("===================end=====================");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nPilihan tidak valid.");
                    break;
            }
        }
    }
}