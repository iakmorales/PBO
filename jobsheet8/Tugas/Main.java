package jobsheet8.Tugas;

public class Main {
    public static void main(String[] args) {
        Roti roti1 = new Roti("Roti Manis", "Tepung Terigu Premium");
        Coklat coklat1 = new Coklat("Coklat Hitam", 70);

        roti1.tampilkanLabel();
        roti1.produksi();

        System.out.println("----------------------");

        coklat1.tampilkanLabel();
        coklat1.produksi();
    }
}
