/**
 * Buku04
 */
public class Buku04 {

    String judul, pengarang;
    int halaman, stok, harga;

    Buku04(){
    }
    Buku04(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }

    void tampilInformasi(){
        System.out.println("Judul : " + judul);
        System.out.println("Pngarang : " + pengarang );
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
    if (stok > 0) {
        stok -= jml;
        System.out.println(jml + "Buku telah terjual");
    } else {
        System.out.println("Stok tidak mencukupi!");
    }
}
    void restock (int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
}