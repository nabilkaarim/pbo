public abstract class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected String model;
    protected int tahun;

    public Kendaraan(String platNomor, String merk, String model, int tahun) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    public abstract String getTipeKendaraan();

    public String getInfo() {
        return getTipeKendaraan() + " - " + merk + " " + model + " (" + tahun + ")";
    }

    public String getPlatNomor() {
        return platNomor;
    }
}
