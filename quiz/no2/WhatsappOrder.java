package quiz.no2;

public class WhatsappOrder extends Order {

    public WhatsappOrder(String tanggalOrder) {
        super(tanggalOrder);
    }

    @Override
    public void konfirmasiOrder() {
        System.out.println("Konfirmasi order dikirim melalui WhatsApp.");
    }
}
