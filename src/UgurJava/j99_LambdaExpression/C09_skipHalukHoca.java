package UgurJava.j99_LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C09_skipHalukHoca {
    //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.
    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println(menu.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).skip(2).collect(Collectors.toList()));
        menu.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).skip(2).collect(Collectors.toList()).forEach(Lambda_Methods::bosluklaYazdir);
    }
}
