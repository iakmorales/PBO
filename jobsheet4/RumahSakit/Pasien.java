package jobsheet4.RumahSakit;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<>();
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasiBaru = new Konsultasi();
        konsultasiBaru.setTanggal(tanggal);
        konsultasiBaru.setDokter(dokter);
        konsultasiBaru.setPerawat(perawat);
        this.riwayatKonsultasi.add(konsultasiBaru);
    }
    
    public String getInfo(){
        String info = "";
        info += "No Rekam Medis    : " + this.noRekamMedis + "\n";
        info += "Nama              : " + this.nama + "\n";
        
        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi : \n";

            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n";

        return info;
    }
}
