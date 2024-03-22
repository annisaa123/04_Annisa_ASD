import java.util.Scanner;
/**
 * PersegiPanjangDemo_04
 */
public class PersegiPanjangDemo_04 {

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.println("Masukkan banyak persegi panjang: ");
        int length = sc04.nextInt();

        PersegiPanjang_04[] arrayOfPersegiPanjang = new PersegiPanjang_04[length];
        int panjang, lebar;

        for (int i = 0; i < length; i++) {
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan Panjang: ");
            panjang = sc04.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc04.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang_04(panjang, lebar);
        }

        System.out.println("== - == - == - == - == - == - ==");

        for (int i = 0; i < length; i++) {
        arrayOfPersegiPanjang[i].cetakInfo();
        arrayOfPersegiPanjang[i].hitungLuas();
        arrayOfPersegiPanjang[i].hitungKeliling();
    }
    }
}