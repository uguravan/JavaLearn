package UgurJava.interview;

import java.util.Arrays;

public class Task01_SameLetters {
    /*
1 -->> Write a a return method that check if a string is build out of the same letters as another string.
Ex : same("abc", "cab"); --> true
        same("abc", "abb"); --> false*/

    public static void main(String[] args) {
        String s1 ="abc", s2="cab";
        System.out.println(same(s1, s2));

        String s3 ="abc", s4="abb";
        System.out.println(same(s3, s4));
    }
    public static boolean same(String s1, String s2) {
        boolean flag = true;
        char[] arr1 = s1.toLowerCase().toCharArray();
        String[] arr3 = s1.toLowerCase().split("");
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

    }
}
