package jobsheet8.Tugas;

abstract class PabrikMakanan {
    String nama;

    void tampilkanLabel() {
        System.out.println("Produk: " + nama);
    }
    
    abstract void produksi();
}
