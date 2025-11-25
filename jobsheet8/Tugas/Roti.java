package jobsheet8.Tugas;

class Roti extends PabrikMakanan {
    String jenisTepung;

    Roti(String nama, String jenisTepung) {
        this.nama = nama;
        this.jenisTepung = jenisTepung;
    }

    @Override
    void produksi() {
        System.out.println("Memproduksi roti dengan tepung: " + jenisTepung);
    }
}
