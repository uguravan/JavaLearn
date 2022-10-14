package UgurJava.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {
        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */
        int numArr[]= {15,25,22,18,30};
        Arrays.sort(numArr);
        System.out.println(numArr[numArr.length-2]);

    }
}
