package soalno3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Servis Bengkel Maju Jaya ===");

        Kendaraan mobil1 = new Mobil("N 1234 AB", "Toyota", 2020);
        Kendaraan motor1 = new Motor("N 5678 XY", "Honda", 2022);

        mobil1.tampilData();
        motor1.tampilData();
    }
}
