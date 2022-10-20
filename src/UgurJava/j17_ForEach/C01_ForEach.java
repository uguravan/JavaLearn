package UgurJava.j17_ForEach;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(List.of(16, 5, 2, 33, 22, 27, 41, 24));
        for (int i : scores) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : scores.subList(3,scores.size())) {
            if (i%2==1) System.out.println(i);
        }
        int sum=0;
        for (int i : scores.subList(2,6)) {
            sum += i;
        }
        System.out.println(sum);
    }
}
