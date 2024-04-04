/**
 * PersegiPanjang_04
 */
public class PersegiPanjang_04 {

    public int panjang;
    public int lebar;

    public PersegiPanjang_04(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public PersegiPanjang_04() {
        
    }
    void hitungLuas() {
        int luas = panjang*lebar;
        System.out.println("Luas: "+ luas);
    }
    void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("keliling: "+keliling);
    }

    public void cetakInfo() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Panjang: "+ panjang);
        System.out.println("Lebar; "+ lebar);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}