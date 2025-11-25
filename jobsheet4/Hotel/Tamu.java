import java.util.ArrayList;
import java.util.List;

public class Tamu {
    private String idTamu;
    private String namaTamu;
    private List<Reservasi> daftarReservasi; //Untuk menyimpan semua data reservasi yang pernah dibuat tamu, tipe datanya reservasi

    public Tamu(String idTamu, String namaTamu) { //constructor berparameter
        this.idTamu = idTamu;
        this.namaTamu = namaTamu;
        this.daftarReservasi = new ArrayList<>();//inisialisasi atribut daftarReservasi agar bisa dipakai
    }

    // Getter & Setter
    public String getIdTamu() {
        return idTamu;
    }

    public void setIdTamu(String idTamu) {
        this.idTamu = idTamu;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }

    public List<Reservasi> getDaftarReservasi() {
        return daftarReservasi;
    }

    // Method
    
    public void buatReservasi(Reservasi reservasi) {
        daftarReservasi.add(reservasi);
        reservasi.setTamu(this); // hubungkan tamu ke reservasi
        System.out.println("Reservasi " + reservasi.getIdReservasi() + " berhasil dibuat untuk " + namaTamu);
    }
    
    public void batalReservasi(Reservasi reservasi) {
        daftarReservasi.remove(reservasi);
        reservasi.setTamu(null);
        System.out.println("Reservasi " + reservasi.getIdReservasi() + " dibatalkan oleh " + namaTamu);
    }
    
    public void tampilkanInfo() {
        System.out.println("ID Tamu: " + idTamu);
        System.out.println("Nama Tamu: " + namaTamu);
        System.out.println("Jumlah Reservasi: " + daftarReservasi.size());
    }
}