package quiz.no2;

public class Main {
    public static void main(String[] args) {
        MailOrder mo = new MailOrder("2023-10-01");
        WebOrder wo = new WebOrder("2023-10-02");
        WhatsappOrder wwa = new WhatsappOrder("2023-10-03");

        mo.tampilkanTanggalOrder();
        wo.tampilkanTanggalOrder();
        wwa.tampilkanTanggalOrder();
        
        mo.konfirmasiOrder();
        wo.konfirmasiOrder();
        wwa.konfirmasiOrder();

        mo.lacakStatusOrder();
        wo.lacakStatusOrder();
    }
}
