package soalno3;

class Motor extends Kendaraan {
    public Motor(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun);
    }

    public double hitungBiayaServis() {
        return 250000;
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
        System.out.println("Jenis: Motor");
        System.out.println("Biaya Servis: Rp" + (int)hitungBiayaServis());
        System.out.println("Biaya Servis + Cuci: Rp" + (int)hitungBiayaServis(true));
        System.out.println();
    }
}
