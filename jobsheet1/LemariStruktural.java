public class LemariStruktural {
    public static void main(String[] args) {

        String bahan1 = "Kayu";    double ukuran1 = 2.0;   String warna1 = "Coklat";
        String bahan2 = "Besi";    double ukuran2 = 1.8;   String warna2 = "Hitam";
        String bahan3 = "Plastik"; double ukuran3 = 1.5;   String warna3 = "Putih";
        String bahan4 = "Kayu";    double ukuran4 = 2.5;   String warna4 = "Coklat";
        String bahan5 = "Besi";    double ukuran5 = 2.0;   String warna5 = "Abu-abu";
        String bahan6 = "Kayu";    double ukuran6 = 1.7;   String warna6 = "Coklat";
        String bahan7 = "Plastik"; double ukuran7 = 1.6;   String warna7 = "Biru";
        String bahan8 = "Kayu";    double ukuran8 = 2.2;   String warna8 = "Merah";
        String bahan9 = "Besi";    double ukuran9 = 1.9;   String warna9 = "Hitam";
        String bahan10= "Kayu";    double ukuran10= 2.4;   String warna10= "Coklat";

        bukaPintu("Lemari 1", bahan1, ukuran1, warna1);
        tutupPintu("Lemari 2", bahan2, ukuran2, warna2);
        bukaPintu("Lemari 3", bahan3, ukuran3, warna3);
        tutupPintu("Lemari 4", bahan4, ukuran4, warna4);
        bukaPintu("Lemari 5", bahan5, ukuran5, warna5);
        tutupPintu("Lemari 6", bahan6, ukuran6, warna6);
        tutupPintu("Lemari 7", bahan7, ukuran7, warna7);
        bukaPintu("Lemari 8", bahan8, ukuran8, warna8);
        tutupPintu("Lemari 9", bahan9, ukuran9, warna9);
        bukaPintu("Lemari 10", bahan10, ukuran10, warna10);
    }

    public static void bukaPintu(String nama, String bahan, double ukuran, String warna) {
        System.out.println(nama + " [" + bahan + ", " + ukuran + "m, " + warna + "] pintunya dibuka.");
    }

    public static void tutupPintu(String nama, String bahan, double ukuran, String warna) {
        System.out.println(nama + " [" + bahan + ", " + ukuran + "m, " + warna + "] pintunya ditutup.");
    }
}

