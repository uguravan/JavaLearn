package UgurJava.Homeworks;

public class Task02_ElectricityRunner {
/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create edinizPassByValue2
     */
    public static void main(String[] args) {

        Task02_ElektrikHesap fatura1 = new Task02_ElektrikHesap();
        fatura1.tüketimEkle(400);
        fatura1.tüketimEkle(500);
        System.out.println("Toplam tüketim = " + fatura1.toplamTuketim);
        System.out.println("Ödenecek tutar= "+ fatura1.odenecekTutar(fatura1.toplamTuketim));
    }
}
