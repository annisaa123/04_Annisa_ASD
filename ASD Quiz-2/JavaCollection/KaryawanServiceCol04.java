package JavaCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KaryawanServiceCol04 {
    private List<KaryawanCol04> karyawanList;

    public KaryawanServiceCol04() {
        karyawanList = new ArrayList<>();
        // Menambahkan data awal
        tambahKaryawan(new KaryawanCol04("001", "Annisa", "2004-08-01"));
        tambahKaryawan(new KaryawanCol04("002", "Saria Fauzani", "2004-02-20"));
        tambahKaryawan(new KaryawanCol04("003", "Marga Reta", "2005-06-15"));
        tambahKaryawan(new KaryawanCol04("004", "Eka Putri", "2004-03-20"));
        tambahKaryawan(new KaryawanCol04("005", "Hifna Nazwa", "2004-11-04"));
    }

    // Menambah data karyawan
    public void tambahKaryawan(KaryawanCol04 karyawan) {
        karyawanList.add(karyawan);
    }

    // Menghapus data karyawan berdasarkan ID
    public void hapusKaryawan(String idKaryawan) {
        karyawanList.removeIf(karyawan -> karyawan.getIdKaryawan().equals(idKaryawan));
    }

    // Mengakses data karyawan berdasarkan ID
    public KaryawanCol04 aksesKaryawan(String idKaryawan) {
        for (KaryawanCol04 karyawan : karyawanList) {
            if (karyawan.getIdKaryawan().equals(idKaryawan)) {
                return karyawan;
            }
        }
        return null;
    }

    // Mencetak semua data karyawan
    public void cetakSemuaKaryawan() {
        for (KaryawanCol04 karyawan : karyawanList) {
            System.out.println(karyawan);
        }
    }

    // Mengurutkan karyawan berdasarkan nama
    public void urutkanKaryawan() {
        karyawanList.sort(Comparator.comparing(KaryawanCol04::getNama));
    }

    // Mencari karyawan berdasarkan nama
    public KaryawanCol04 cariKaryawan(String nama) {
        for (KaryawanCol04 karyawan : karyawanList) {
            if (karyawan.getNama().equalsIgnoreCase(nama)) {
                return karyawan;
            }
        }
        return null;
    }
}