import java.util.Scanner;

public class Fungsii_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] namaCabang = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        
        System.out.println("DATA Pendapatan setiap cabang jika semua bunga habis terjual");
        System.out.println("=============================================================");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = hitungPendapatan(stokBunga[i], hargaBunga);
            System.out.println(                namaCabang[i] + ": " + pendapatan);

            
        } System.out.println("==========================================================");
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" ");
        
        
        System.out.println(" Jumlah stok setiap jenis bunga pada cabang Royal Garden 4 setelah pengurangan");
        System.out.println("===============================================================================");
        int[] stokSetelahPengurangan = hitungStokSetelahPengurangan(stokBunga[3]);
        for (int i = 0; i < stokSetelahPengurangan.length; i++) {
            System.out.println("        " + namaBunga(i) + ": " + stokSetelahPengurangan[i] + "     ");
            
        }
    }
    
    public static int hitungPendapatan(int[] stokBunga, int[] hargaBunga) {
        int pendapatan = 0;
        for (int i = 0; i < stokBunga.length; i++) {
            pendapatan += stokBunga[i] * hargaBunga[i];
        }
        return pendapatan;
    }
    
    public static int[] hitungStokSetelahPengurangan(int[] stokBunga) {
        int[] stokSetelahPengurangan = new int[stokBunga.length];
        for (int i = 0; i < stokBunga.length; i++) {
            stokSetelahPengurangan[i] = stokBunga[i] - hitungPenguranganStok(namaBunga(i));
        }
        return stokSetelahPengurangan;
    }
    
    public static int hitungPenguranganStok(String jenisBunga) {
        switch (jenisBunga) {
            case "Aglonema":
                return 1;
            case "Keladi":
                return 2;
            case "Alocasia":
                return 0;
            case "Mawar":
                return 5;
            default:
                return 0;
        }
    }
    
    private static String namaBunga(int jenisBunga) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        return namaBunga[jenisBunga];
    }


}