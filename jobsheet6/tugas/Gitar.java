package jobsheet6.tugas;

public class Gitar extends AlatMusik {
    public String jenisBody;

    public Gitar() {

    }
    public Gitar(String namaAlat, String tipeAlat, double harga, String jenisBody){
        super(namaAlat, tipeAlat, harga);
        this.jenisBody = jenisBody;
    }

    public String tampilkanInfo() {
        return "Jenis Body          : " + this.jenisBody;
    }

    public String tampilkanSemua() {
        String info = super.tampilkanInfo();
        info += this.tampilkanInfo();

        return info;
    }
}
