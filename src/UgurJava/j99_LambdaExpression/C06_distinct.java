package UgurJava.j99_LambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
    // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(List.of(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        List<String> menu = new ArrayList<>(List.of("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokoreç","yağlama","güveç","arabAşı","tantuni"));

        menu.stream().sorted().map(String::toUpperCase).distinct().forEach(Lambda_Methods::bosluklaYazdir);
        System.out.println();

        // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
        menu.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda_Methods::bosluklaYazdir);
        System.out.println();

        // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
        menu.stream().sorted(Comparator.comparing(String::length)).forEach(Lambda_Methods::bosluklaYazdir); //
        System.out.println();

        // Task : menu elemanlarının son harfine göre ters sıralı print ediniz.
        menu.stream().distinct().sorted(Comparator.comparing(t -> t.toString().substring(t.toString().length()-1)).reversed()).forEach(Lambda_Methods::bosluklaYazdir); //
        System.out.println();

        // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
        menu.stream().map(String::length).map(t->t*t).filter(t ->t%2==0).distinct().sorted(Comparator.reverseOrder()).forEach(Lambda_Methods::bosluklaYazdir);
    }
}
