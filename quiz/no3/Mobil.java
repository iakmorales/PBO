package quiz.no3;

class Mobil extends Kendaraan {
    Mobil(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " berjalan di jalan raya dengan 4 roda.");
    }

    void nyalakanAC() {
        System.out.println(nama + " menyalakan AC.");
    }
}
