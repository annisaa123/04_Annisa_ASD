package Tugas;

public class Nilai04 {

        double nilai;
        String kode, kdMatkul, nimMhs;
    
        public Nilai04(String kode, double nilai, String kdMatkul, String nimMhs) {
            this.nilai = nilai;
            this.kode = kode;
            this.kdMatkul = kdMatkul;
            this.nimMhs = nimMhs;
        }
    
        void tampil() {
            System.out.printf("%d", nilai);
        }
}