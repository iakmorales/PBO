package jobsheet2;
public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public void displayInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public void displayLuasKeliling() {
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
