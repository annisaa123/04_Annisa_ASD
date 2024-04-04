/**
 * BukuMain04
 */
public class BukuMain04 {

    String judul, pengarang;
    int halaman, stok, harga;


void tampilInformasi (){
    System.out.println("Judul : " + judul);
    System.out.println("Pengarang : " + pengarang);
    System.out.println("Jumlah halaman : " + halaman);
    System.out.println("Sisa stok : " + stok);
    System.out.println("Harga : Rp. " + harga);
}

void terjual(int jml) {
    if (stok > 0) {
        stok -= jml;
    } else {
        System.out.println("Stok tidak mencukupi!");
    }
}

void restock(int jml){
    stok += jml;
}

void gantiHarga(int hrg){
    harga = hrg;
}

public static void main(String[] args) {
    BukuMain04 bk1 = new BukuMain04();
    bk1.judul = "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga= 71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.tampilInformasi();

    Buku04 bk2 = new Buku04("Self reward","Maheera Ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilInformasi();

    Buku04 bkannisa = new Buku04("Tentang Kamu", "Annisa", 75, 25, 80000);
    bkannisa.tampilInformasi();
}
}