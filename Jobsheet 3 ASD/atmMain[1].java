import java.util.Scanner;

public class atmMain {
    public static void main(String[] args) {
        atm[] rekenings = new atm[2];
        rekenings[0] = new atm("Annisa", "11223344", 1000000);
        rekenings[1] = new atm("Saria", "44556677", 2000000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor rekening: ");
        String nomorRekening = scanner.nextLine();

        atm rekening = null;
        for (atm acc : rekenings) {
            if (acc.getNomorRekening().equals(nomorRekening)) {
                rekening = acc;
                break;
            }
        }
        if (rekening != null) {
            System.out.println("Selamat datang, " + rekening.getNama());
            System.out.println("Saldo Anda saat ini: " + rekening.getSaldo());

            // Operasi ATM
            System.out.print("Masukkan jumlah penarikan: ");
            double tarikan = scanner.nextDouble();
            rekening.tarikTunai(tarikan);

            System.out.print("Masukkan jumlah setoran: ");
            double setoran = scanner.nextDouble();
            rekening.setorTunai(setoran);
        } else {
            System.out.println("Nomor rekening tidak ditemukan.");
        }
        
    }
}
