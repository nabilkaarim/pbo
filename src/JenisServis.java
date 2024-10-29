public class JenisServis {
    private String namaServis;
    private double biayaDasar;

    public JenisServis(String namaServis, double biayaDasar) {
        this.namaServis = namaServis;
        this.biayaDasar = biayaDasar;
    }

    // Getter untuk nama servis
    public String getNamaServis() {
        return namaServis;
    }

    // Metode untuk menghitung biaya servis
    public double hitungBiaya() {
        // Jika ada komponen biaya tambahan, dapat ditambahkan dalam perhitungan ini
        return biayaDasar;
    }
}
