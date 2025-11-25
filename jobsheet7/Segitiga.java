package jobsheet7;
public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        double keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total sudut (1 sudut diketahui): " + segitiga.totalSudut(60));
        System.out.println("Total sudut (2 sudut diketahui): " + segitiga.totalSudut(60, 30));
        System.out.println("Keliling (3 sisi diketahui): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (siku-siku): " + segitiga.keliling(3, 4));
    }
}
