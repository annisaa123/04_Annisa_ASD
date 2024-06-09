package Tugas;

/**
 * Mahasiswa04
 */
public class Mahasiswa04 {

    String nim, nama, telf;
    
        public Mahasiswa04(String nim, String nama, String telf) {
            this.nim = nim;
            this.nama = nama;
            this.telf = telf;
        }
        void tampil() {
            System.out.printf("%-10s %-15s %s", nim, nama, telf);
            System.out.println("");
        }
}