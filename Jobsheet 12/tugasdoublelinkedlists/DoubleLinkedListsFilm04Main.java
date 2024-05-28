package tugasdoublelinkedlists;
import java.util.Scanner;

public class DoubleLinkedListsFilm04Main {

    public static void menu() {
        System.out.println("=========================");
        System.out.println("  Data Film Layar Lebar  ");
        System.out.println("=========================");
        System.out.println(" 1. Tambah Data Awal");
        System.out.println(" 2. Tambah Data Akhir");
        System.out.println(" 3. Tambah Data Index Tertentu");
        System.out.println(" 4. Hapus Data Pertama");
        System.out.println(" 5. Hapus Data Terakhir");
        System.out.println(" 6. Hapus Data Tertentu");
        System.out.println(" 7. Cetak");
        System.out.println(" 8. Cari ID Film");
        System.out.println(" 9. Urut Data Rating Film DESC");
        System.out.println(" 10. Keluar");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc04 = new Scanner(System.in);
        Scanner sd04 = new Scanner(System.in);
        Scanner sb04 = new Scanner(System.in);

        DoubleLinkedListsFilm04 dll = new DoubleLinkedListsFilm04();

        int pilih;
        do {
            menu();
            pilih = sc04.nextInt();
            sc04.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film\t\t: ");
                    int id = sd04.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulFilm = sc04.nextLine();
                    System.out.print("Rating Film\t: ");
                    double rating = sb04.nextDouble();
                    dll.addFirst(id, judulFilm, rating);
                    sc04.nextLine();
                    break;

                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film\t\t: ");
                    int idD = sd04.nextInt();
                    System.out.print("Judul Film\t: ");
                    String judulFilmM = sc04.nextLine();
                    System.out.print("Rating Film\t: ");
                    double ratingG = sb04.nextDouble();
                    dll.addLast(idD, judulFilmM, ratingG);
                    sc04.nextLine();
                    break;

                case 3:
                    System.out.println("Masukkan Data Film Posisi yang diinginkan");
                    System.out.print("Urutan ke - ");
                    int idx = sd04.nextInt();
                    if (idx < 0 || idx > dll.size) {
                        System.out.println("Nilai indeks di luar batas. Indeks yang valid adalah 0 hingga " + dll.size);
                    } else {
                        System.out.print("ID Film\t\t: ");
                        int idDD = sd04.nextInt();
                        sc04.nextLine();  // consume the newline
                        System.out.print("Judul Film\t: ");
                        String judulFilmMM = sc04.nextLine();
                        System.out.print("Rating Film\t: ");
                        double ratingGG = sb04.nextDouble();
                        dll.add(idDD, judulFilmMM, ratingGG, idx);
                        sc04.nextLine();
                    }
                    break;

                case 4:
                    dll.removeFirst();
                    dll.print();
                    break;

                case 5:
                    dll.removeLast();
                    dll.print();
                    break;

                case 6:
                    System.out.println("Hapus Data Film Posisi yang diinginkan");
                    System.out.print("Urutan ke - ");
                    int index = sd04.nextInt();
                    if (index < 0 || index >= dll.size) {
                        System.out.println("Nilai indeks di luar batas. Indeks yang valid adalah 0 hingga " + (dll.size - 1));
                    } else {
                        dll.remove(index);
                        dll.print();
                    }
                    break;

                case 7:
                    dll.print();
                    break;

                case 8:
                    System.out.println("Cari ID Film Yang ingin dicari");
                    System.out.print("Masukkan ID\t: ");
                    int cari = sd04.nextInt();
                    int idF = dll.findSeqSearch(cari);
                    dll.tampilPosisi(cari, idF);
                    break;

                case 9:
                    System.out.println("Data Akan diurut secara DESC");
                    dll.sort();
                    break;

                case 10:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1 hingga 10.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 10);
    }
}
