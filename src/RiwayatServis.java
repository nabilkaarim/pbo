import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RiwayatServis {
    private String idServis;
    private Date tanggal;
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private JenisServis jenisServis;
    private double totalBiaya;

    public RiwayatServis(String idServis, Date tanggal, Kendaraan kendaraan,
                         Pelanggan pelanggan, JenisServis jenisServis) {
        this.idServis = idServis;
        this.tanggal = tanggal;
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.jenisServis = jenisServis;
        this.totalBiaya = jenisServis.hitungBiaya();
    }

    // Method overloading with validation
    public void tambahBiayaTambahan(double biayaTambahan) {
        if (biayaTambahan < 0) {
            throw new IllegalArgumentException("Biaya tambahan tidak boleh negatif");
        }
        this.totalBiaya += biayaTambahan;
    }

    public void tambahBiayaTambahan(double biayaTambahan, String keterangan) {
        tambahBiayaTambahan(biayaTambahan);
        System.out.println("Biaya tambahan: " + keterangan);
    }

    public String getInfoServis() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String tanggalFormat = dateFormat.format(tanggal);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String biayaFormat = currencyFormat.format(totalBiaya);

        return String.format("""
            ID Servis: %s
            Tanggal: %s
            Kendaraan: %s
            Pelanggan: %s
            Jenis Servis: %s
            Total Biaya: %s
            """,
            idServis,
            tanggalFormat,
            kendaraan.getInfo(),
            pelanggan.getNama(),
            jenisServis.getNamaServis(),
            biayaFormat
        );
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}
