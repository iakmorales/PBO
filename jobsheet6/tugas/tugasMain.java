package jobsheet6.tugas;

public class tugasMain {
    public static void main(String[] args) {
        Gitar gitar1 = new Gitar("Gitar-Yamaha F310", "Akustik", 3000000, "Dreadnought");
        System.out.println(gitar1.tampilkanSemua());
        System.out.println("");
        Piano piano1 = new Piano("Piano-Kawai K-300", "Pianika", 500000, "Upright");
        System.out.println(piano1.tampilkanSemua());
    }
}

