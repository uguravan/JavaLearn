package UgurJava.j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    // Task : array içerisinde bişey aramak.

    public static void main(String[] args) {
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};
        int num = 34;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "aradığınız sayı dizinde var" : "aradığınız sayı dizinde yok");
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, num));
        System.out.println(Arrays.binarySearch(arr, -5));//-1 sonucunda - sayının olmadığını, 1 de olsaydı kaçıncı sırada olacağını gösterir.

    }
}
