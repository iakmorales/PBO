public class HotelDemo {
    public static void main(String[] args) {
        // Buat tamu
        Tamu tamu1 = new Tamu("T001", "Andi");
        tamu1.tampilkanInfo();

        // Buat reservasi
        Reservasi reservasi1 = new Reservasi("R001", "2025-09-20", "2025-09-23", 3);
        tamu1.buatReservasi(reservasi1);

        // Buat kamar
        KamarReservasi kamar1 = new KamarReservasi("101", "Deluxe", 500000);
        KamarReservasi kamar2 = new KamarReservasi("102", "Suite", 800000);

        // Tambahkan kamar ke reservasi
        reservasi1.tambahKamar(kamar1);
        reservasi1.tambahKamar(kamar2);

        // Tampilkan daftar kamar
        reservasi1.tampilKamar();

        // Hitung total biaya
        System.out.println("Total Biaya: Rp " + reservasi1.hitungTotalBiaya());

        // Tampilkan nama tamu dari reservasi
        System.out.println("Reservasi ini dimiliki oleh: " + reservasi1.getTamu().getNamaTamu());

        // Tamu membatalkan reservasi
        tamu1.batalReservasi(reservasi1);
    }
}

