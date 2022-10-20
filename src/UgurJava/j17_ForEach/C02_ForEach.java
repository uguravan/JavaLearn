package UgurJava.j17_ForEach;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEach {
    public static void main(String[] args) {
        int[][] arr={{2,3},{4},{5,6,7}};
        ArrayList<Integer> scores = new ArrayList<>(List.of(16, 5, 2, 33, 22, 27, 41, 24));
        int çarpım=1;
        for (int [] i : arr) {
           for (int j : i) {
               çarpım*=j;
           }
        }
    }
}
