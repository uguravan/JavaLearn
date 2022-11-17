package UgurJava.Denemeler;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi sayıya kadar olan mükemmel sayıları yazdıralım? ");
        int last = scan.nextInt();
        perfectNumbers(last);
    }

    private static void perfectNumbers(int last) {
        for (int i = 1; i <last; i++) {
            uniquePerfectNumber(i);
        }
    }

    private static void uniquePerfectNumber(int u) {
        int sum=0;
        for (int i = 1; i < u; i++) {
            if(u%i==0){
                sum+=i;
            }
        }
        if(sum==u){
            System.out.print(u+" ");
        }
    }
}
