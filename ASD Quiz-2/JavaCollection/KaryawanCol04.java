package JavaCollection;

public class KaryawanCol04 {
    private String idKaryawan;
    private String nama;
    private String tanggalLahir;

    public KaryawanCol04() {}

    public KaryawanCol04(String idKaryawan, String nama, String tanggalLahir) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    @Override
    public String toString() {
        return "Karyawan{" +
                "idKaryawan='" + idKaryawan + '\'' +
                ", nama='" + nama + '\'' +
                ", tanggalLahir='" + tanggalLahir + '\'' +
                '}';
    }
}