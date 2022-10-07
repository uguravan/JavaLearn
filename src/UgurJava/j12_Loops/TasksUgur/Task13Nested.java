package UgurJava.j12_Loops.TasksUgur;
import java.util.Scanner;

public class Task13Nested {
    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
        Scanner sc=new  Scanner(System.in);
        System.out.println("ağam hangi BÜYÜK harfe kadar yazdıralım : ");
        int c=sc.nextLine().toUpperCase().trim().charAt(0);

        if (c>=65 && c<=90) {
            for (int i = 0; i <= (c - ('A')); i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print((char) (65 + i) + " ");
                }
                System.out.println();//dumy
            }
        } else System.out.println("ağam girdiğiniz harf değil, nettin? ");
    }
}
