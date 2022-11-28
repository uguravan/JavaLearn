package UgurJava.Projects.P11_depoYonetimi.DepoUgur;

import java.util.HashMap;

public class Urunler {
    static int idVer = 1000;
    String urunIsmi;
    String uretici;
    int miktar;//miktar methodda tanımlanacak
    String birim;
    String raf;//methodda tanımlanacak
    int id;//otomatik olarak idVer 1 artılıp cons. da kendisi atayacak

    public Urunler(String urunIsmi, String uretici, String birim) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.id=idVer++;
    }
}
