package UgurJava.Homeworks.Constructors;

public class Kalem {
    static double uc=0.9;
    String model;
    int fiyat=100;
    public Kalem() {
        this.uc = 0.3;
    }
    public Kalem(String marka) {
        //marka = model;
        this.model = marka;
    }

    @Override
    public String toString() {
        return "Kalem{" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }

    public Kalem(double uc , int fiyat) {
        this();
        this.uc = uc;
        this.fiyat = fiyat;
    }
    public Kalem(double uc , int fiyat , String model) {
        this();
        this.uc = uc;
        this.fiyat = fiyat;
        this.model = model;
    }
}
