package tugasdoublelinkedlists;

import java.util.Scanner;

public class VaksinMain04 {

    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("\n1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        DoubleLinkedListsVks04 dll = new DoubleLinkedListsVks04();
        Scanner sc04 = new Scanner(System.in);
        int pilih = 0;

        do {
            menu();
            pilih = sc04.nextInt();
            sc04.nextLine(); // consume newline
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    String no_antrian = sc04.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc04.nextLine();
                    Vaksin04 vn = new Vaksin04(no_antrian, nama);
                    dll.enqueue(vn);
                    break;
                case 2:
                    try {
                        dll.dequeue();
                        System.out.println("Data pengantri vaksin berhasil dihapus.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("|No.\t|Nama\t|");
                    dll.print();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 4);

        sc04.close();
    }
}
