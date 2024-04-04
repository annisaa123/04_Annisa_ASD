import java.util.Scanner;

public class StackPakaianMain04 {
    public static void main(String[] args) {
    
    StackPakaian04 stk14 = new StackPakaian04(5);
    Scanner sc14 = new Scanner(System.in);
    
    char pilih;
    
    do{
        System.out.print("Jenis: ");
        String jenis = sc14.nextLine();
        System.out.print("Warna: ");
        String warna = sc14.nextLine();
        System.out.print("Merk: ");
        String merk = sc14.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = sc14.nextLine();
        System.out.print("Harga: ");
        double harga = sc14.nextDouble();

        Pakaian04 p04 = new Pakaian04(jenis, warna, merk, ukuran, harga);
        System.out.print("Apakah anda akan menambahakan data baru ke stack (y/n)? ");
        pilih = sc14.next().charAt(0);
        sc14.nextLine();
        stk14.push(p04);
    } while (pilih == 'y');

    stk14.getMax();
    stk14.print();
    stk14.pop();
    stk14.peek();
    stk14.print();
    
    }

}