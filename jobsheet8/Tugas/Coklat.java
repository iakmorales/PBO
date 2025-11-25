package jobsheet8.Tugas;

class Coklat extends PabrikMakanan {
    int kadarKakao;

    Coklat(String nama, int kadarKakao) {
        this.nama = nama;
        this.kadarKakao = kadarKakao;
    }

    @Override
    void produksi() {
        System.out.println("Memproduksi coklat dengan kadar kakao: " + kadarKakao + "%");
    }
}
