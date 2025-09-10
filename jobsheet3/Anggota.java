package jobsheet3;

public class Anggota {
    private String nama;
    private String nomorKTP;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    public Anggota(String nama, String nomorKTP, double limitPeminjaman) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(double nominal) {
        double minimal = jumlahPinjaman * 0.1; 
        if (nominal < minimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= nominal;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}
