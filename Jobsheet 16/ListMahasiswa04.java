import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa04 {

        List<Mahasiswa04> mahasiswas = new ArrayList<>();

    //fungsi sorting ascending berdasarkan nim
        public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
        }

         //fungsi sorting descending berdasarkan nim
        public void sortDescending() {
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs2.nim.compareTo(mhs1.nim));
        }

        public void tambah(Mahasiswa04... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
        }

        public void hapus(int index) {
        mahasiswas.remove(index);
        }

        public void update(int index, Mahasiswa04 mhs) {
        mahasiswas.set(index, mhs);
        }

        public void tampil() {
        mahasiswas.forEach(mhs -> {
                System.out.println(mhs.toString());
        });
        }

        int binarySearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
                if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
        }
        }
        return -1;
}
        public static void main(String[] args) {
        ListMahasiswa04 lm = new ListMahasiswa04();
        Mahasiswa04 m = new Mahasiswa04("201234", "Noureen", "02xx1");
        Mahasiswa04 m1 = new Mahasiswa04("201235", "Akhleema", "021xx2");
        Mahasiswa04 m2 = new Mahasiswa04("201236", "Shannum", "021xx3");

        // Menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);

        // Menampilkan list mahasiswa
        System.out.println("Daftar Mahasiswa:");
        lm.tampil();

        // Update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa04("201235", "Akhleema Lela", "021xx2"));
        System.out.println("\nSetelah Update:");
        lm.tampil();

        // Sorting Ascending
        System.out.println("\nSorting Ascending:");
        lm.sortAscending();
        lm.tampil();

        // Sorting Descending
        System.out.println("\nSorting Descending:");
        lm.sortDescending();
        lm.tampil();
}
}
