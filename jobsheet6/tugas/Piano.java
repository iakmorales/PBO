package jobsheet6.tugas;

public class Piano extends AlatMusik{
    public String jenisMekanisme;;

    public Piano() {

    }
    public Piano(String namaAlat, String tipeAlat, double harga, String jenisMekanisme){
        super(namaAlat, tipeAlat, harga);
        this.jenisMekanisme = jenisMekanisme;
    }

    public String tampilkanInfo() {
        return "Jenis Mekanisme     : " + this.jenisMekanisme;
    }

    public String tampilkanSemua() {
        String info = super.tampilkanInfo();
        info += this.tampilkanInfo();

        return info;
    }    
}
