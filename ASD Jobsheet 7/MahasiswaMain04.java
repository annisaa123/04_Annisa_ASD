import java.util.Scanner;
/**
 * MahasiswaMain04
 */
public class MahasiswaMain04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        int jumMhs = 5;

        System.out.println("Input jumlah Mahasiswa: ");
        int maxSize = s.nextInt();

        PencarianMhs04 data = new PencarianMhs04(maxSize);

        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil : ");
        for (int i = 0; i < maxSize; i++) {
            System.out.println("--------------------------------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa04 m = new Mahasiswa04(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("------------------------------------------");
            System.out.println("Data Keseluruhan Mahasiswa : ");
            data.tampil();

            System.out.println("------------------------------------------");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
            System.out.print("Nama: ");
            String cari = s.next();

            System.out.println("===================================================");
            System.out.println("Menggunakan Binary search");
            int posisi = data.FindBinarySearch(cari, 0, maxSize - 1);
            data.TampilPosisi(cari, posisi);
            data.TampilData(cari, posisi);
    }
}