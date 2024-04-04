public class MainMahasiswa04 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi04 list = new DaftarMahasiswaBerprestasi04();
        Mahasiswa04 m1 = new Mahasiswa04("Annisa", 2023, 19, 4);
        Mahasiswa04 m2 = new Mahasiswa04("Putri", 2023, 19, 3.9);
        Mahasiswa04 m3 = new Mahasiswa04("Prygo", 2021, 21, 3.5);
        Mahasiswa04 m4 = new Mahasiswa04("Alkyndy", 2021, 21, 3.6);
        Mahasiswa04 m5 = new Mahasiswa04("Raisa", 2022, 20, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting = ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting desc berdasarkan IPK");
        list.bubbleSort(); //descending
        list.tampil();

    System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
    list.selectionSort();
    list.tampil();

    System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
    list.insertionSort();
    list.tampil();

    }
}