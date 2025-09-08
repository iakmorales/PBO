package jobsheet2;

public class mobil {
    String merk;
    String warna;
    String tipeMobil;

    public void nyalakanMobil(){
        System.out.println(("Mobil " + merk + " menyala"));
    }

    public void matikanMobil(){
        System.out.println(("Mobil " + merk + " mati"));
    }

    public void berjalan(){
        System.out.println(("Mobil " + merk + " berjalan"));
    }

    public void tampilkanInfo(){
        System.out.println("Merk Mobil : " + merk);
        System.out.println("Warna Mobil : " + warna);
        System.out.println("Tipe Mobil : " + tipeMobil);
    }
}
