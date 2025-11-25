package soalno3;

public class Kendaraan {
     private String noPlat;
    private String merk;
    private int tahun;

    public Kendaraan(String noPlat, String merk, int tahun) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    public double hitungBiayaServis() {
        return 0;
    }

    public double hitungBiayaServis(boolean denganCuci) {
        if (denganCuci) {
            return hitungBiayaServis() + 50000;
        } else {
            return hitungBiayaServis();
        }
    }

    public void tampilData() {
        System.out.println("No Plat: " + getNoPlat());
        System.out.println("Merk: " + getMerk());
        System.out.println("Tahun: " + getTahun());
    }
}

