package jobsheet6.tugas;

public class AlatMusik {
    protected String namaAlat;
    protected String tipeAlat;
    protected double harga;

    public AlatMusik(){

    }

    public AlatMusik(String namaAlat, String tipeAlat, double harga) {
        this.namaAlat = namaAlat;
        this.tipeAlat = tipeAlat;
        this.harga = harga;
    }

    public String tampilkanInfo() {
        String info = "";
        info += "Nama Alat Musik     : " + namaAlat + "\n";
        info += "Tipe Alat Musik     : " + tipeAlat + "\n";
        info += "Harga               : " + harga + "\n";
        return info;
    }
}
