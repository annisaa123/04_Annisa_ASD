import java.util.Scanner;

public class PostfixMain04 {

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc04.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix04 post = new Postfix04(total);
        P = post.konversi(Q);
        System.out.println("Posttix:"+P);
    }
}