public class Kendaraan {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    @Override
    public String toString() {
        return "No TNKB: " + noTNKB + ", " + nama + ", " + jenis + ", cc kendaraan " + cc + ", tahun " + tahun + ", bulan harus bayar " + bulanHarusBayar;
    }
}
