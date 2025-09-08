package jobsheet2;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 5;
        pp1.lebar = 3;
        pp1.displayInfo();
        pp1.getLuas();
        pp1.getKeliling();
        pp1.displayLuasKeliling();
        System.out.println();

        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.panjang = 6;
        pp2.lebar = 4;
        pp2.displayInfo();
        pp2.getLuas();
        pp2.getKeliling();
        pp2.displayLuasKeliling();
    }
}
