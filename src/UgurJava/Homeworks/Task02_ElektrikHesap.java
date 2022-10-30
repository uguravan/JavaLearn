package UgurJava.Homeworks;

public class Task02_ElektrikHesap {
/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create edinizPassByValue2
     */
    int toplamTuketim;
    final private double oran=0.7;
    double fatura;

    public int tüketimEkle(int tüketim){
        return toplamTuketim += tüketim;
    }
    public double odenecekTutar(int toplamTuketim){
        return fatura = oran*toplamTuketim;
    }

    @Override
    public String toString() {
        return "ElwktrikHesap{" +
                "toplamTuketim=" + toplamTuketim +
                ", fatura=" + fatura +
                '}';
    }
}
