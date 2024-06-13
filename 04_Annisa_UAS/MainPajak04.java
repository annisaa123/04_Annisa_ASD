import java.util.Scanner;

public class MainPajak04 {

    static Kendaraan[] kendaraanList = new Kendaraan[10];
    static TransaksiPajak[] transaksiList = new TransaksiPajak[10];
    static int kendaraanCount = 0;
    static int transaksiCount = 0;
    static long totalPendapatan = 0;

    public static void main(String[] args) {
        kendaraanList[kendaraanCount++] = new Kendaraan("S 4567 YV", "annisa", "mobil", 2000, 2012, 4);
        kendaraanList[kendaraanCount++] = new Kendaraan("N 4511 VS", "afril", "mobil", 2500, 2015, 3);
        kendaraanList[kendaraanCount++] = new Kendaraan("AB 4321 A", "eka putri", "motor", 125, 2010, 2);
        kendaraanList[kendaraanCount++] = new Kendaraan("B 1234 AG", "Hifna", "motor", 150, 2020, 1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    lihatDaftarKendaraan();
                    break;
                case 2:
                    bayarPajak(scanner);
                    break;
                case 3:
                    lihatTransaksiPajak();
                    break;
                case 4:
                    urutkanTransaksiPajak();
                    break;
                case 5:
                    lihatTotalPendapatan();
                    break;
                case 6:
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    public static void menu() {
        System.out.println("\n===================================");
        System.out.println("Sistem Pembayaran Pajak Kendaraan Bermotor");
        System.out.println("===================================");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Bayar Pajak");
        System.out.println("3. Tampilkan Seluruh Transaksi");
        System.out.println("4. Urutkan Transaksi berdasarkan Nama Pemilik");
        System.out.println("5. Lihat Total Pendapatan");
        System.out.println("6. Keluar");
        System.out.println("===================================");
    }

    public static void lihatDaftarKendaraan() {
        System.out.println("\n===================================");
        System.out.println("Daftar Kendaraan:");
        System.out.println("===================================");
    
        for (int i = 0; i < kendaraanCount; i++) {
            Kendaraan kendaraan = kendaraanList[i];
            System.out.println((i + 1) + ". " + "No TNKB: " + kendaraan.noTNKB);
            System.out.println("   Nama: " + kendaraan.nama);
            System.out.println("   Jenis: " + kendaraan.jenis);
            System.out.println("   CC Kendaraan: " + kendaraan.cc);
            System.out.println("   Tahun: " + kendaraan.tahun);
            System.out.println("   Bulan Harus Bayar: " + kendaraan.bulanHarusBayar);
            System.out.println("-----------------------------------");
        }
    
        System.out.println("===================================");
    }
    

    public static void bayarPajak(Scanner scanner) {
        System.out.println("\n===================================");
        System.out.print("Masukkan nomor TNKB kendaraan: ");
        String noTNKB = scanner.nextLine();
        Kendaraan kendaraan = cariKendaraan(noTNKB);

        if (kendaraan != null) {
            System.out.print("Masukkan bulan bayar (angka 1-12): ");
            int bulanBayar = scanner.nextInt();
            scanner.nextLine(); // consume newline

            long nominalBayar = hitungNominalPajak(kendaraan);
            long denda = hitungDenda(kendaraan, bulanBayar);

            transaksiList[transaksiCount++] = new TransaksiPajak(nominalBayar, denda, bulanBayar, kendaraan);
            totalPendapatan += nominalBayar + denda;

            System.out.println("Transaksi berhasil! Kode transaksi: " + (TransaksiPajak.kodeCounter - 1));
        } else {
            System.out.println("Kendaraan tidak ditemukan!");
        }
        System.out.println("===================================");
    }

    public static void lihatTransaksiPajak() {
        System.out.println("\n===================================");
        System.out.println("Daftar Transaksi Pajak:");
        System.out.println("===================================");
        for (int i = 0; i < transaksiCount; i++) {
            System.out.println(transaksiList[i]);
        }
        System.out.println("===================================");
    }

    public static void urutkanTransaksiPajak() {
        for (int i = 0; i < transaksiCount - 1; i++) {
            for (int j = 0; j < transaksiCount - i - 1; j++) {
                if (transaksiList[j].kendaraan.nama.compareTo(transaksiList[j + 1].kendaraan.nama) > 0) {
                    // Swap
                    TransaksiPajak temp = transaksiList[j];
                    transaksiList[j] = transaksiList[j + 1];
                    transaksiList[j + 1] = temp;
                }
            }
        }

        System.out.println("\n===================================");
        System.out.println("Transaksi Pajak yang sudah diurutkan berdasarkan Nama Pemilik:");
        System.out.println("===================================");
        for (int i = 0; i < transaksiCount; i++) {
            System.out.println(transaksiList[i]);
        }
        System.out.println("===================================");
    }

    public static void lihatTotalPendapatan() {
        System.out.println("\n===================================");
        System.out.println("Total Pendapatan dari Pajak Kendaraan: " + totalPendapatan);
        System.out.println("===================================");
    }

    public static Kendaraan cariKendaraan(String noTNKB) {
        for (int i = 0; i < kendaraanCount; i++) {
            if (kendaraanList[i].noTNKB.equalsIgnoreCase(noTNKB)) {
                return kendaraanList[i];
            }
        }
        return null;
    }

    public static long hitungNominalPajak(Kendaraan kendaraan) {
        long tarif = 0;
        if (kendaraan.jenis.equalsIgnoreCase("motor")) {
            if (kendaraan.cc < 100) {
                tarif = 100000;
            } else if (kendaraan.cc >= 100 && kendaraan.cc <= 250) {
                tarif = 250000;
            } else {
                tarif = 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("mobil")) {
            if (kendaraan.cc < 1000) {
                tarif = 750000;
            } else if (kendaraan.cc >= 1000 && kendaraan.cc <= 2500) {
                tarif = 1000000;
            } else {
                tarif = 1500000;
            }
        }
        return tarif;
    }

    public static long hitungDenda(Kendaraan kendaraan, int bulanBayar) {
        long denda = 0;
        if (bulanBayar > kendaraan.bulanHarusBayar) {
            int selisihBulan = bulanBayar - kendaraan.bulanHarusBayar;
            if (selisihBulan >= 1 && selisihBulan <= 3) {
                denda = 50000;
            } else if (selisihBulan > 3) {
                denda = 50000 * selisihBulan;
            }
        }
        return denda;
    }
}
