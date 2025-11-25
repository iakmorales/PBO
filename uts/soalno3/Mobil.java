package soalno3;

class Mobil extends Kendaraan {
    public Mobil(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun);
    }

    public double hitungBiayaServis() {
        return 500000;
    }

    public double hitungBiayaServis(boolean denganCuci) {
        if (denganCuci) {
            return hitungBiayaServis() + 50000;
        } else {
            return hitungBiayaServis();
        }
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis: Mobil");
        System.out.println("Biaya Servis: Rp" + (int)hitungBiayaServis());
        System.out.println("Biaya Servis + Cuci: Rp" + (int)hitungBiayaServis(true));
        System.out.println();
    }
}
