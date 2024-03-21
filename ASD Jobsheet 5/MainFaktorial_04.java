import java.util.Scanner;
/**
 * MainFaktorial_04
 */
public class MainFaktorial_04 {

public static void main(String[] args) {
Scanner sc04 = new Scanner(System.in);

System.out.println("==========================================");
System.out.print("Masukkan jumlah elemen yang dihitung : ");
int elemen = sc04.nextInt ();

Faktorial_04 [] fk04 = new Faktorial_04 [elemen];
for (int i = 0; i < elemen; i++) {
    fk04 [i] = new Faktorial_04();
    System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
    fk04[i].nilai = sc04.nextInt();
}
    System.out.println("======================================");
    System.out.println("Hasil Faktorial dengan Brute Force");
    long startTime = System.nanoTime();
    for(int i = 0; i < elemen; i++){
        System.out.println("Faktorial dari nilai" + fk04[i].nilai + " adalah :" + fk04[i].faktorialBF(fk04[i].nilai));
    }
    long endTime = System.nanoTime();
    double timeTakenBF = (endTime-startTime)/1_000_000_000.0;
    System.out.println("Waktu eksekusi Brute Force; " + (timeTakenBF)+ " seconds");
    startTime = System.nanoTime();
    System.out.println("===========================================");
    System.out.println("Hasil Faktorial dengan Divide and Conquer");
    for (int i = 0; i < elemen; i++) {
    System.out.println("Faktorial dari nilai "+fk04[i].nilai+" adalah : "+fk04[i].faktorialBF(fk04[i].nilai));
    }
    endTime = System.nanoTime();
    double timeTakenDC = (endTime - startTime)/1_000_000_000.0;
    System.out.println("Waktu eksekusi Brute Force: " + (timeTakenDC)+ "seconds");
    System.out.println("==========================================");
    }
    }