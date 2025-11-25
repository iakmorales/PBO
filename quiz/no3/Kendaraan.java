package quiz.no3;

abstract class Kendaraan {
    String nama;

    Kendaraan(String nama) {
        this.nama = nama;
    }

    abstract void bergerak(); // abstract method
}
