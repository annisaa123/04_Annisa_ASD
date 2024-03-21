import java.util.Scanner;
/**
 * MainSum_04
 */
public class MainSum_04 {

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan Jumlah Perusahaan : ");
        int jumlahPerusahaan = sc04.nextInt();
        Sum_04 sm[] = new Sum_04[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++){
            System.out.print("Masukkan jumlah bulan perusahaan ke-"+(i+1)+" = ");
            int elm = sc04.nextInt();
            sm[i] = new Sum_04(elm);
        }
        System.out.println("============================================");
        for (int i = 0; i < sm.length; i++){
            System.out.println("Perusahaan ke-"+(i+1));
        for (int j = 0; j < sm[i].elemen; j++) {
            System.out.print("Masukkan untung bulan ke - " + (j+1) + " = ");
            sm[i].keuntungan[j] = sc04.nextDouble();
        }
    }
    for (int i = 0; i < sm.length; i++) {
        System.out.println("\nPerusahaan ke-"+(i+1));
        System.out.println("=============================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntungan perusahaan selama " + "%d bulan adalah %1.2f\n", sm[i].elemen, sm[i].totalBF(sm[i].keuntungan));
        System.out.println("=============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.printf("Total keuntungan perusahaan selama " + "%d bulan adalah %1.2f\n", sm[i].elemen, sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
        System.out.println("=============================================");
    }
}
}
