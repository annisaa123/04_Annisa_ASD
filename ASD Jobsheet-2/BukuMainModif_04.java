/**
 * BukuMainModif_04
 */
public class BukuMainModif_04 {

    
}
    public static void main(String[] args) {
        Buku04 bk04 = new Buku04();
        bk04.judul = "Today Ends Tomorrow Comes";
        bk04.pengarang = "Denanda Pratiwi";
        bk04.halaman = 198;
        bk04.stok = 13;
        bk04.harga = 71000;

        bk04.tampilInformasi();
        bk04.terjual(5);
        bk04.gantiHarga(60000);
        bk04.tampilInformasi();

        Buku04 bk2Buku04 = new Buku04("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2Buku04.terjual(11);
        bk2Buku04.tampilInformasi();

        int jumlahBukuTerjual = 5;
        double hargaFinal = bk04.finalHarga(jumlahBukuTerjual);
        System.out.println("Harga setelah diskon: Rp. " + hargaFinal);
    }