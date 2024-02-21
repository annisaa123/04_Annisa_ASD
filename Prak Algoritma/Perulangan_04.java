import java.util.Scanner;
/**
 * Perulangan_04
 */
public class Perulangan_04 {

    public static void main(String[] args) {
        Scanner04 = new Scanner (System.in);

        System.out.println("Masukkan NIM: ");
        String nim = scanner.nextLine();
        int n = nim.charAt(nim.length() - 1) - '0';

        if (n<10) {
            n +=10;
        }
        System.out.println("n : " + n);

    for (int i = 2; i<=n; i++){
        if (i == 6 || i == 10)continue;
        if (i % 2 == 1) {
            System.out.print("* ");
        }else {
            System.out.print(i + " ");
        }
        }
    }
    }
