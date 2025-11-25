package quiz.no2;

public abstract class Order {
    public String tanggalOrder;

    public Order(String tanggalOrder) {
        this.tanggalOrder = tanggalOrder;
    }

    public abstract void konfirmasiOrder();

    public void tampilkanTanggalOrder() {
        System.out.println("Tanggal order: " + tanggalOrder);
    }
}