package quiz.no2;

public class WebOrder extends Order implements Trackable {

    public WebOrder(String tanggalOrder) {
        super(tanggalOrder);
    }

    @Override
    public void konfirmasiOrder() {
        System.out.println("Konfirmasi order dikirim ke email.");
    }

    @Override
    public void lacakStatusOrder() {
        System.out.println("Melacak status order melalui situs web.");
    }
}
