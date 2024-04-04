/**
 * PencarianMhs04
 */
public class PencarianMhs04 {
Mahasiswa04 listMhs[];
int idx;

public  PencarianMhs04(int maxSize) {
    listMhs = new Mahasiswa04[maxSize];
}
    void tambah(Mahasiswa04 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("----------------------------------------");
        }
        }

    public int FindSeqSearch (int cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int compareResult = cari.compareTo(listMhs[mid].nama);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            }else {
                return FindBinarySearch(cari, left, right);
            }
        }
        return -1;
            }
    public void TampilPosisi (String cari, int pos) {
        if (pos!= -1) {
            System.out.println("Data " + cari + "ditemukan pada indeks " + (
    pos+1));
        }else {
            System.out.println("Data " + cari + "tidak ditemukan");
        }
        }

    public void TampilData (String cari, int pos) {
        if (pos!= -1) {
            int startIdx = pos;
            int endIdx = pos;

            while (startIdx >= 0 && listMhs[endIdx].nama.equals(cari)) {
                startIdx--;
            }
            startIdx++;

            while (endIdx < idx && listMhs[endIdx].nama.equals(cari)){
            endIdx++;
        }
        endIdx--;

        if (startIdx != endIdx) {
            System.out.println("Peringatan: lebih dari satu mahasiswa dengan nama " + cari + "ditemukan");
        }
        for(int i = startIdx; i <= endIdx; i++) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + cari);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
            System.out.println("================================");
        }
    } else {

        System.out.println("data " + cari + "tidak ditemukan");
    }
}
}