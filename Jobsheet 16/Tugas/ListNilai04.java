package Tugas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListNilai04 {

    List<Mahasiswa04> mhs = new ArrayList<>();
    List<MataKuliah04> matkul = new ArrayList<>();
    List<Nilai04> listNilai = new ArrayList<>();

    // input data Mahasiswa
    public void inputDataMahasiswa(Mahasiswa04... mahasiswas) {
        mhs.addAll(Arrays.asList(mahasiswas));
    }

    // input list nilai mahasiswa
    public void inputNilaiMahasiswa(Nilai04 n) {
        listNilai.add(n);
    }

    // input data Mata Kuliah
    public void inputDataMataKuliah(MataKuliah04... mk) {
        matkul.addAll(Arrays.asList(mk));
    }
    // tampil data Mahasiswa
public void tampilDataMahasiswa() {
    mhs.stream().forEach(mhs -> {
        mhs.tampil();
    });
}

// tampil data Mata Kuliah
public void tampilDataMataKuliah() {
    matkul.stream().forEach(matkul -> {
        matkul.tampil();
    });
}

// tampil list nilai mahasiswa
public void tampilListNilai() {
    for (int i = 0; i < listNilai.size(); i++) {
        int indexMhs = linearSearchMHS(listNilai.get(i).nimMhs);
        int indexMatkul = linearSearchMatkul(listNilai.get(i).kdMatkul);
        System.out.printf("%-10s %-12s %-10.2f\n",
                mhs.get(indexMhs).nama, matkul.get(indexMatkul).namaMatkul,
                listNilai.get(i).nilai);
    }
}
// mencari nim mahasiswa
int linearSearchMHS(String nim) {
    for (int i = 0; i < mhs.size(); i++) {
        if (nim.equals(mhs.get(i).nim)) {
            return i;
        }
    }
    return -1;
}

// mencari kode mata kuliah
int linearSearchMatkul(String kode) {
    for (int i = 0; i < matkul.size(); i++) {
        if (kode.equals(matkul.get(i).kode)) {
            return i;
        }
    }
    return -1;
}

// mencari nilai mahasiswa
int linearSearchNilaiMahasiswa(String nimMahasiswa) {
    for (int i = 0; i < listNilai.size(); i++) {
        if (nimMahasiswa.equals(listNilai.get(i).nimMhs)) {
            return i;
        }
    }
    return -1;
}
// sorting data nilai mahasiswa
public void sortingData() {
    Collections.sort(listNilai, new Comparator<Nilai04>() {
    public int compare(Nilai04 n1, Nilai04 n2) {
        return Double.compare(n1.nilai, n2.nilai);
    }
});
}
//menghapus data pertama sesuai dengan fifo
public void removeList (){
    listNilai.remove(0);
}
}