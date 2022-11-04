package UgurJava.interview;

import java.util.Scanner;

public class Task13EvenOdd {
    /*
13 -->>  Write a method which can identifies given number is even or odd
*/
    public static void main(String[] args) {
        int num=24;
        evenOdd(num);
    }

    private static void evenOdd(int num) {
        System.out.println(num%2==0? "even number " : "odd number");
    }
}
