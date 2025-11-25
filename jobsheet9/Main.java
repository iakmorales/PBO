package jobsheet9;

public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Angin Tornado", 250000, "Putih", "Cosmos");
        TV tv = new TV("LED", 10, 3500000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 4500000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(5, 2, 7500000, "Abu-Abu", "Panasonic");

        System.out.println(kipas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
    }
}

