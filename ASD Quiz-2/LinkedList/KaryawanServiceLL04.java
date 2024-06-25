package LinkedList;

public class KaryawanServiceLL04 {
    private Node head;

    public KaryawanServiceLL04() {
        // Menambahkan data awal
        tambahKaryawan(new KaryawanLL04("001", "Annisa", "2004-08-01"));
        tambahKaryawan(new KaryawanLL04("002", "Saria Fauzani", "2004-02-20"));
        tambahKaryawan(new KaryawanLL04("003", "Marga Reta", "2005-06-15"));
        tambahKaryawan(new KaryawanLL04("004", "Eka Putri", "2004-03-20"));
        tambahKaryawan(new KaryawanLL04("005", "Hifna Nazwa", "2004-11-04"));
    }

    // Metode untuk menambahkan karyawan
    public void tambahKaryawan(KaryawanLL04 karyawan) {
        Node newNode = new Node(karyawan);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Metode untuk menghapus karyawan berdasarkan ID
    public void hapusKaryawan(String idKaryawan) {
        if (head == null) {
            return;
        }
        if (head.karyawan.getIdKaryawan().equals(idKaryawan)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.karyawan.getIdKaryawan().equals(idKaryawan)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Metode untuk mengakses karyawan berdasarkan ID
    public KaryawanLL04 aksesKaryawan(String idKaryawan) {
        Node current = head;
        while (current != null) {
            if (current.karyawan.getIdKaryawan().equals(idKaryawan)) {
                return current.karyawan;
            }
            current = current.next;
        }
        return null;
    }

    // Metode untuk mencetak semua karyawan
    public void cetakSemuaKaryawan() {
        Node current = head;
        while (current != null) {
            System.out.println(current.karyawan);
            current = current.next;
        }
    }

    // Metode untuk melakukan sorting berdasarkan nama karyawan
    public void urutkanKaryawan() {
        if (head == null || head.next == null) {
            return; // Tidak perlu sorting jika tidak ada atau hanya satu node
        }

        Node current = head;
        Node index = null;
        KaryawanLL04 temp;

        while (current != null) {
            index = current.next;

            while (index != null) {
                // Mengurutkan berdasarkan nama (ascending)
                if (current.karyawan.getNama().compareTo(index.karyawan.getNama()) > 0) {
                    temp = current.karyawan;
                    current.karyawan = index.karyawan;
                    index.karyawan = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    // Metode untuk melakukan searching berdasarkan nama karyawan
    public KaryawanLL04 cariKaryawan(String nama) {
        Node current = head;
        while (current != null) {
            if (current.karyawan.getNama().equalsIgnoreCase(nama)) {
                return current.karyawan;
            }
            current = current.next;
        }
        return null;
    }

    // Node inner class untuk LinkedList
    private static class Node {
        KaryawanLL04 karyawan;
        Node next;

        public Node(KaryawanLL04 karyawan) {
            this.karyawan = karyawan;
            this.next = null;
        }
    }
}
