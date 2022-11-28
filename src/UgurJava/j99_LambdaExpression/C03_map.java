package UgurJava.j99_LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(List.of(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));

    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
        sayi.stream().filter(t -> t%2 == 0).map(t -> t*t).forEach(t -> System.out.print(t + " "));
        System.out.println();
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(C03_map::kareAl).forEach(C01_LambdaExpression::yazdir);
        System.out.println();

        // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
        sayi.stream().filter(t -> t%2 == 1).map(t -> (t*t*t+1)).forEach(t -> System.out.print(t + " "));
        System.out.println();
        sayi.stream().filter(Lambda_Methods::tekMi).map(Lambda_Methods::küpAl).map(t -> t+1).forEach(Lambda_Methods::bosluklaYazdir);

        //Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t ->(int)Math.sqrt(t)).forEach(C01_LambdaExpression::yazdir);
    }
    public static int kareAl(int X) {
        return X*X;
    }
}
