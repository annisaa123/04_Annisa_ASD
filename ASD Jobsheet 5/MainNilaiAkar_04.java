import java.util.Scanner;
/**
 * MainNilaiAkar_04
 */
public class MainNilaiAkar_04 {

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("\t\tNILAI AKAR PANGKAT");
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah bilangan yang ingin dihitung akarnya: ");
        int jumlahBilangan = sc04.nextInt();

        NilaiAkar_04[] akar = new NilaiAkar_04[jumlahBilangan];
        for (int i = 0; i < jumlahBilangan; i++) {
            akar[i] = new NilaiAkar_04();
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            akar[i].nilai = sc04.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Brute Force");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarPangkatDuaBF(akar[i].nilai));
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Divide and Conquer");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akar[i].nilai + " adalah: " + akar[i].akarPangkatDuaDC(akar[i].nilai, 0, akar[i].nilai));
        }
        System.out.println("=======================================================");
    }
}