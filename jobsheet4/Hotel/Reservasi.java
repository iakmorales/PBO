import java.util.ArrayList;
import java.util.List;

public class Reservasi {
    private String idReservasi;
    private String tanggalCheckIn;
    private String tanggalCheckOut;
    private int lamaMenginap;
    private List<KamarReservasi> daftarKamar;
    private Tamu tamu; // Relasi ke tamu

    public Reservasi(String idReservasi, String tanggalCheckIn, String tanggalCheckOut, int lamaMenginap) {
        this.idReservasi = idReservasi;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        this.lamaMenginap = lamaMenginap;
        this.daftarKamar = new ArrayList<>();
    }

    // Getter & Setter
    public String getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(String idReservasi) {
        this.idReservasi = idReservasi;
    }

    public String getTanggalCheckIn() {
        return tanggalCheckIn;
    }

    public void setTanggalCheckIn(String tanggalCheckIn) {
        this.tanggalCheckIn = tanggalCheckIn;
    }

    public String getTanggalCheckOut() {
        return tanggalCheckOut;
    }

    public void setTanggalCheckOut(String tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
    }

    public int getLamaMenginap() {
        return lamaMenginap;
    }

    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

    public List<KamarReservasi> getDaftarKamar() {
        return daftarKamar;
    }

    public void setDaftarKamar(List<KamarReservasi> daftarKamar) {
        this.daftarKamar = daftarKamar;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    // Method
    public void tambahKamar(KamarReservasi kamar) {
        daftarKamar.add(kamar);
        System.out.println("Kamar " + kamar.getNomorKamar() + " berhasil ditambahkan ke reservasi " + idReservasi);
    }

    public void tampilKamar() {
        System.out.println("Daftar kamar untuk reservasi " + idReservasi + ":");
        for (KamarReservasi kamar : daftarKamar) {
            kamar.tampilDetailKamar();
        }
    }

    public double hitungTotalBiaya() {
        double total = 0;
        for (KamarReservasi kamar : daftarKamar) {
            total += kamar.getHargaPerMalam() * lamaMenginap;
        }
        return total;
    }
}

