package quiz.no3;

public class Main {
    public static void main(String[] args) {
        // Heterogeneous Collection
        Kendaraan[] daftar = {
            new Mobil("Avanza"),
            new Motor("Vario"),
            new Mobil("Civic")
        };

        // Polymorphism in Action (pemanggilan method yang di-override)
        for (Kendaraan k : daftar) {
            k.bergerak(); // masing-masing panggil versinya sendiri
        }

        System.out.println();

        // Polymorphic Argument
        cekKendaraan(new Motor("Ninja"));
        cekKendaraan(new Mobil("Fortuner"));

        System.out.println();

        // Object Casting + instanceof
        for (Kendaraan k : daftar) {
            if (k instanceof Mobil) {
                Mobil m = (Mobil) k; // downcasting
                m.nyalakanAC();
            } else if (k instanceof Motor) {
                Motor mo = (Motor) k;
                mo.pasangHelm();
            }
        }
    }

    // Method dengan parameter polymorphic
    static void cekKendaraan(Kendaraan k) {
        System.out.println("Mengecek kendaraan: " + k.nama);
        k.bergerak();
    }
}
