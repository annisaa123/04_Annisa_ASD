import java.util.Scanner;

public class MahasiswaMain_04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        Mahasiswa_04[] arrayOfMahasiswa_04 = new Mahasiswa_04[3];

        double total,rataRata;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa_04[i] = new Mahasiswa_04();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            arrayOfMahasiswa_04[i].nama = sc04.nextLine();
            System.out.print("Masukkan nim mahasiswa: ");
            arrayOfMahasiswa_04[i].nim = sc04.nextLine();
            System.out.print("Masukkan jenis kelamin Mahasiswa: ");
            arrayOfMahasiswa_04[i].jenisKelamin = sc04.nextLine();
            System.out.print("Masukkan Ipk Mahasiswa: ");
            arrayOfMahasiswa_04[i].Ipk = sc04.nextDouble();

            sc04.nextLine();
        }


        System.out.println();
        System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println("Mahasiswa ke-" + (i+1));
                System.out.println("Nama: " + arrayOfMahasiswa_04[i].nama);
                System.out.println("Nim: " + arrayOfMahasiswa_04[i].nim);
                System.out.println("Jenis kelamin: " + arrayOfMahasiswa_04[i].jenisKelamin);
                System.out.println("Ipk: " + arrayOfMahasiswa_04[i].Ipk);
    
            }
            total = 0;
            for (int i = 0; i < arrayOfMahasiswa_04.length; i++) {
                total = total+ arrayOfMahasiswa_04[i].Ipk;
            }
            rataRata = total / arrayOfMahasiswa_04.length;

            System.out.println("Rata-rata IPK Mahasiswa: " + rataRata);
        }
    }
