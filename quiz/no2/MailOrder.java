package quiz.no2;

public class MailOrder extends Order implements Trackable {

    public MailOrder(String tanggalOrder) {
        super(tanggalOrder);
    }

    @Override
    public void konfirmasiOrder() {
        System.out.println("Konfirmasi order via surat");
    }

    @Override
    public void lacakStatusOrder() {
        System.out.println("Melacak status pengiriman surat.");
    }
}
