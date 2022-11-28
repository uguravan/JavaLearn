package UgurJava.Projects.P11_depoYonetimi.DepoUgur;

import java.util.HashMap;

public class Islemler implements Methods{
    HashMap<Integer, Urunler> urunMap = new HashMap<>();
    //HashMap -> urunİd , Urunler
    String urunIsmiArr[] = {"Un" , "Şeker" , "Yumurta" , "Helva" , "Yağ" , "Margarin"};
    String ureticiArr[] = {"Hekimoğlu" , "Ekici" , "Ova un" , "Ülker" , "Bili Bili"};
    String urunBirimiArr[] = {"Koli" , "Çuval" , "Paket" , "Litre" , "Kilogram"};

    @Override
    public void urunTanimlama() {
        String urunIsmi = urunIsmiSec();
        String uretici = ureticiFirmaSec();
        String birim = urunBirimSec();

        Urunler urun = new Urunler(urunIsmi, uretici, birim);
        urunMap.put(urun.id, urun);
    }

    @Override
    public void urunListele() {

    }

    @Override
    public void urunGirisi() {

    }

    @Override
    public void urunuRafaKoy() {

    }

    @Override
    public void urunCikisi() {

    }

    @Override
    public boolean ayniUrunKontrol() {
        return false;
    }

    @Override
    public String intTryCatch(int limit) {
        return null;
    }

    @Override
    public void menuYazdir() {

    }

    @Override
    public String urunIsmiSec() {
        return null;
    }

    @Override
    public String ureticiFirmaSec() {
        return null;
    }

    @Override
    public String urunBirimSec() {
        return null;
    }
}
