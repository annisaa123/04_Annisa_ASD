import java.util.Scanner;
/**
 * Pemilihan_04
 */
public class Pemilihan_04 {

    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.println("Nilai Tugas (0-100):");
        double tugas = input04.nextFloat();
        System.out.print("Nilai Kuis (0-100): ");
        double kuis = input04.nextFloat();
        System.out.println("Nilai UTS (0-100): ");
        double uts = input04.nextFloat();
        System.out.println("Nilai UAS (0-100): ");
        double uas = input04.nextFloat();

        System.out.println("----------------------");

        if (tugas < 100 && kuis < 100 && uts < 100 && uas < 100) {

            double nilaiakhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            System.out.println("Nilai Akhir: " + nilaiakhir);

            if (nilaiakhir > 88 && nilaiakhir <=100)
            System.out.println("Nilai Huruf: A");
            else if (nilaiakhir > 73 && nilaiakhir <=88)
            System.out.println("Nilai Huruf: B+");
            else if (nilaiakhir > 65 && nilaiakhir <=73)
            System.out.println("Nilai Huruf: B");
            else if (nilaiakhir >60 && nilaiakhir <=65)
            System.out.println("Nilai Huruf: C+");
            else if (nilaiakhir > 50 && nilaiakhir <=60)
            System.out.println("Nilai Huruf: C");
            else if (nilaiakhir > 39 && nilaiakhir <=50)
            System.out.println("Nilai Huruf: D");
            else
            System.out.println("Nilai Huruf: E ");{
            
                String pesan = nilaiakhir < 50 ? "MOHON MAAF ANDA TIDAK LULUS " : "SELAMAT ANDA LULUS";
                System.out.println(pesan);

            }else {

            System.out.println("Nilai Tidak Valid!");
            }
            System.out.println("===================================");
            System.out.println("===================================");

            {
                
            }
        
        }
    }
}