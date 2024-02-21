/**
 * Fungsi_04
 */
public class Fungsi_04 {

    static int[] harga = {75000, 50000, 60000, 10000};
    public static void main(String[]args) {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock[i]);
            System.out.println("===========================");
            System.out.println("Pendapatan Cabang RoyalGarden " + (i + 1) + ":  Rp " + pendapatan);
        }
        System.out.println("===============================================");
        System.out.println();
        stockCabang();
        System.out.println();
        kurangiStock();
    }
    public static int hitungPendapatan(int[] stock){
        int pendapatan = 0;
        for (int i = 0; i < stock.length; i++) {
            pendapatan += stock[i] * harga[i];
        }
        return pendapatan;
    }
    public static void stockCabang(){
        System.out.println("=================================================");
        System.out.println("Menampilkan Stock");
        for (int j = 0; j < stock.length; j++){
            int CabangTerpilih = j;
            int[] stockCabang = stock[CabangTerpilih];

            System.out.println("Total stock Cabang RoyalGarden " + (CabangTerpilih + 1) + ": ");
            for (int i=0; i < stockCabang.length; i++){
                System.out.print(stockCabang[i] + " ");
            }
            System.out.println();
        }
    }
    public static void kurangiStock()
    System.out.println("=====================================================");
    System.out.println("Pengurangan Stock");
    for(int i = 0; i < stock.length; i++){
        int CabangTerpilih = i;
        int[] stockCabang = stock[CabangTerpilih];
        int[] Pengurangan = {1, 2, 0, 5};

        System.out.print("Total Stock Cabang RoyalGarden " + (CabangTerpilih + 1) + ": ");
        for (int j = 0; j < stockCabang.length; j++){
            stockCabang[j] -= Pengurangan[j];
            System.out.print(stockCabang[j] + " ");
        }
        System.out.println();

    }
}