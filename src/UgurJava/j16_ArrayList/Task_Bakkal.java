package UgurJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_Bakkal {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    static ArrayList<String> days = new ArrayList<>(List.of("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
    static ArrayList<Integer> dayProfits = new ArrayList<>();
    static double ort=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day=1;
        int profit;
        double sum=0;
        while (day<=days.size()) {
            System.out.print(day+". günün kazancını giriniz: ");
            profit=scan.nextInt();
            dayProfits.add(profit);
            sum+=profit;
            day++;
        }
        ort= getOrtalamaKazanc(sum);
        System.out.println("Günlük ortalama kazanç= "+ort);
        System.out.println("Ortalamanin Ustundeki Kazanc Günleri: "+getOrtalamaninUstundeKazancGünleri());
        System.out.println("Ortalamanin Altindaki Kazanc Günleri: "+getOrtalamaninAltindaKazancGünleri());
    }

    public static List getOrtalamaninAltindaKazancGünleri() {
        ArrayList<String> ortAltiGunler = new ArrayList<>();
        for (int i = 0; i <dayProfits.size(); i++) {
            if(dayProfits.get(i)<ort){
                ortAltiGunler.add(days.get(i));
            }
        }
        return ortAltiGunler;
    }

    public static List getOrtalamaninUstundeKazancGünleri() {
        ArrayList<String> ortUstuGunler = new ArrayList<>();
        for (int i = 0; i <dayProfits.size(); i++) {
            if(dayProfits.get(i)>ort){
                ortUstuGunler.add(days.get(i));
            }
        }
        return ortUstuGunler;
    }

    public static double getOrtalamaKazanc(double sum) {
        double ortalama=sum/dayProfits.size();
        return ortalama;
    }
}
