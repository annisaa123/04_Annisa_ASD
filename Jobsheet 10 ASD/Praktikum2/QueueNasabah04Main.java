package Praktikum2;
import java.util.Scanner;
public class QueueNasabah04Main {
    public static void menu() {
        System.out.println("Pilih Menu:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc04.nextInt();
        QueueNasabah04 antri = new QueueNasabah04(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc04.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("No. Rekening  : ");
                    String norek = sc04.nextLine();
                    sc04.nextLine();
                    System.out.print("Nama          : ");
                    String nama = sc04.nextLine();
                    System.out.print("Alamat        : ");
                    String alamat = sc04.nextLine();
                    System.out.print("Umur          : ");
                    int umur = sc04.nextInt();
                    System.out.print("Saldo         : ");
                    double saldo = sc04.nextDouble();

                    Nasabah04 nb = new Nasabah04(norek, nama, alamat, umur, saldo);
                    sc04.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah04 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) 
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " 
                            + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}