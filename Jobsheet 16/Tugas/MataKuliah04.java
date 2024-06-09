package Tugas;

public class MataKuliah04 {

    String kode, namaMatkul;
    int sks;

    public MataKuliah04(String kode, String namaMatkul, int sks) {
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    void tampil() {
        System.out.printf("%-10s %-40s %d", kode, namaMatkul, sks);
        System.out.println("");
    }
}