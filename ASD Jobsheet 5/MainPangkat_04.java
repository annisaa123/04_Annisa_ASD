import java.util.Scanner;
/**
 * MainPangkat_04
 */
public class MainPangkat_04 {

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.println("==================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc04.nextInt();

        pangkat_04 [] png = new pangkat_04[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat_04();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1)+" : ");
            png[i].nilai = sc04.nextInt ();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat_04 = sc04.nextInt();
        }

        System.out.println("=============================");
        System.out.println("Pilih metode yang ingin dijalankan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = sc04.nextInt();

        while (true) {
            switch (pilih) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Hasil pangkat dengan Brute Force");
                    for (int i = 0; i < elemen; i++){
                        System.out.println("Nilai "+ png[i].nilai + " pangkat " + png[i].pangkat_04 + "adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat_04));

                    }
                    break;
                case 2:
                System.out.println("=====================================");
                System.out.println("Hasil pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat_04 + "adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat_04));
                } break;

                default:
                System.out.println("=======================================");
                System.out.println("=======================================");
                System.out.println("Pilih metode yang ingin dijalankan");
                System.out.println("1. Brute Force");
                System.out.println("2. Divide and Conque");
                System.out.println("Masukkan pilihan anda");
                pilih = sc04.nextInt();
            }
            if (pilih == 1 || pilih == 2) {
                break;
            }
        }
    }
}