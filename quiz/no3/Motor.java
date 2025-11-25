package quiz.no3;

class Motor extends Kendaraan {
    Motor(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " melaju di jalan dengan 2 roda.");
    }

    void pasangHelm() {
        System.out.println("Pengendara " + nama + " memakai helm.");
    }
}
