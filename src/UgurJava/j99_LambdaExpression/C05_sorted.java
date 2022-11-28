package UgurJava.j99_LambdaExpression;

import UgurJava.Lambda.Lambda_Methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C05_sorted {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(List.of(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        System.out.println(sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted().collect(Collectors.toList()));

        sayi.stream().filter(Lambda_Methods::tekMi).map(Lambda_Methods::kareAl).sorted(Comparator.reverseOrder()).forEach(Lambda_Methods::bosluklaYazdir);
    }

}
