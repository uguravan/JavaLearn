package UgurJava.j99_LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class C04_reduce {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(List.of(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
        System.out.println(sayi.stream().filter(Lambda_Methods::ciftMi).map(Lambda_Methods::kareAl).reduce(Integer.MIN_VALUE, Math::max));

        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE, Math::min));//3
        System.out.println(sayi.stream().reduce(Integer.MIN_VALUE, Math::max));//75

        System.out.println(sayi.stream().reduce(0, (x, y) -> x + y));
        System.out.println();
        System.out.println(sayi.stream().reduce(Integer::sum));
        System.out.println();

        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Math::min));

        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));
    }
}
