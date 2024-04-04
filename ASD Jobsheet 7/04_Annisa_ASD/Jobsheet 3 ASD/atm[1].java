public class atm {
    private String nama;
    private String nomorRekening;
    private double saldo;

    public atm() {

    }

    public atm(String nama2, String nomorRekening2, double saldo2) {
        nama = nama2;
        nomorRekening = nomorRekening2;
        saldo = saldo2;
    }
    public void tarikTunai(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan tunai sebesar " + jumlah + " berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan tunai sebesar " + jumlah);
        }
    }
    public String getNama() {
        return nama;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo2) {
        saldo = saldo2;
    }
    public void setorTunai(double jumlah) {
        saldo += jumlah;
        System.out.println("Setoran tunai sebesar " + jumlah + " berhasil. Saldo saat ini: " + saldo);
    }
}

