package jobsheet4.RumahSakit;
import java.time.LocalDate;
public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    public Pegawai getDokter() {
        return dokter;
    }
    public void setDokter(Pegawai dokter) {
        this.dokter = dokter;
    }
    public Pegawai getPerawat() {
        return perawat;
    }
    public void setPerawat(Pegawai perawat) {
        this.perawat = perawat;
    }
    public String getInfo(){
        String info = "";
        info += "Tanggal           : " + this.tanggal + "\n";
        info += "Dokter            : " + this.dokter.getInfo() + "\n";
        info += "Perawat           : " + this.perawat.getInfo() + "\n";
        info += "\n";

        return info;
    }
}

