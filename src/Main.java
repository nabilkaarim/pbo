
public class Main {
    private Kendaraan[] kendaraanArray;
    private Pelanggan[] pelangganArray;
    private RiwayatServis[] riwayatServisArray;
    private int jumlahKendaraan;
    private int jumlahPelanggan;
    private int jumlahRiwayat;
    private static final int KAPASITAS_MAKSIMAL = 100;

    public Main() {
        this.kendaraanArray = new Kendaraan[KAPASITAS_MAKSIMAL];
        this.pelangganArray = new Pelanggan[KAPASITAS_MAKSIMAL];
        this.riwayatServisArray = new RiwayatServis[KAPASITAS_MAKSIMAL];
        this.jumlahKendaraan = 0;
        this.jumlahPelanggan = 0;
        this.jumlahRiwayat = 0;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        if (jumlahKendaraan < KAPASITAS_MAKSIMAL) {
            kendaraanArray[jumlahKendaraan] = kendaraan;
            jumlahKendaraan++;
            System.out.println("Kendaraan berhasil ditambahkan");
        } else {
            System.out.println("Kapasitas kendaraan penuh");
        }
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        if (jumlahPelanggan < KAPASITAS_MAKSIMAL) {
            pelangganArray[jumlahPelanggan] = pelanggan;
            jumlahPelanggan++;
            System.out.println("Pelanggan berhasil ditambahkan");
        } else {
            System.out.println("Kapasitas pelanggan penuh");
        }
    }

    public void tambahRiwayatServis(RiwayatServis riwayat) {
        if (jumlahRiwayat < KAPASITAS_MAKSIMAL) {
            riwayatServisArray[jumlahRiwayat] = riwayat;
            jumlahRiwayat++;
            System.out.println("Riwayat servis berhasil ditambahkan");
        } else {
            System.out.println("Kapasitas riwayat servis penuh");
        }
    }

    public Kendaraan cariKendaraan(String platNomor) {
        for (int i = 0; i < jumlahKendaraan; i++) {
            if (kendaraanArray[i].getPlatNomor().equals(platNomor)) {
                return kendaraanArray[i];
            }
        }
        return null;
    }

    public RiwayatServis[] tampilkanRiwayatKendaraan(String platNomor) {
        RiwayatServis[] riwayatKendaraan = new RiwayatServis[KAPASITAS_MAKSIMAL];
        int jumlahRiwayatDitemukan = 0;
        
        for (int i = 0; i < jumlahRiwayat; i++) {
            if (riwayatServisArray[i].getKendaraan().getPlatNomor().equals(platNomor)) {
                riwayatKendaraan[jumlahRiwayatDitemukan] = riwayatServisArray[i];
                jumlahRiwayatDitemukan++;
            }
        }
        
        RiwayatServis[] hasilPencarian = new RiwayatServis[jumlahRiwayatDitemukan];
        System.arraycopy(riwayatKendaraan, 0, hasilPencarian, 0, jumlahRiwayatDitemukan);
        
        return hasilPencarian;
    }
}