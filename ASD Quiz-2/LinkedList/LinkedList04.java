package LinkedList;

public class LinkedList04 {
    private Node04 head;

    public LinkedList04() {
        head = null;
        // Menambahkan data awal
        tambahKaryawan(new KaryawanLL04("001", "Annisa", "2004-08-01"));
        tambahKaryawan(new KaryawanLL04("002", "Saria Fauzani", "2004-02-20"));
        tambahKaryawan(new KaryawanLL04("003", "Marga Reta", "2005-06-15"));
        tambahKaryawan(new KaryawanLL04("004", "Hifna Nazwa", "2004-03-20"));
        tambahKaryawan(new KaryawanLL04("005", "Eka Putri", "2004-11-04"));
    }

    // Menambah data karyawan
    public void tambahKaryawan(KaryawanLL04 karyawan) {
        Node04 newNode = new Node04(karyawan);
        if (head == null) {
            head = newNode;
        } else {
            Node04 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Menghapus data karyawan berdasarkan ID
    public void hapusKaryawan04(String idKaryawan) {
        if (head == null) return;

        if (head.data.getIdKaryawan().equals(idKaryawan)) {
            head = head.next;
            return;
        }

        Node04 current = head;
        Node04 prev = null;
        while (current != null && !current.data.getIdKaryawan().equals(idKaryawan)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        }
    }

    // Mengakses data karyawan berdasarkan ID
    public KaryawanLL04 aksesKaryawan(String idKaryawan) {
        Node04 temp = head;
        while (temp != null) {
            if (temp.data.getIdKaryawan().equals(idKaryawan)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Mencetak semua data karyawan
    public void cetakSemuaKaryawan() {
        Node04 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}