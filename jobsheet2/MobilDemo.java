package jobsheet2;

public class MobilDemo {
    public static void main(String[] args) {
        mobil m1 = new mobil();
        m1.merk = "Toyota";
        m1.warna = "Hitam";
        m1.tipeMobil = "SUV";
        m1.tampilkanInfo();
        m1.nyalakanMobil();
        m1.merk = "Avanza";
        m1.berjalan();
        m1.matikanMobil();

        System.out.println();

        mobil m2 = new mobil();
        m2.merk = "Honda";
        m2.warna = "Merah";
        m2.tipeMobil = "Sedan";
        m2.tampilkanInfo();
        m2.nyalakanMobil();
        m2.merk = "Civic";
        m2.berjalan();
        m2.matikanMobil();
    }
}
