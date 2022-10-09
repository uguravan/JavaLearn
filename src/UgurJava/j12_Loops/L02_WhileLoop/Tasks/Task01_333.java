package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01_333 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
        int sum = 0;
        int adet = 0;

        while (sum <= 333) {
            Scanner scan = new Scanner(System.in);
            System.out.print("bir sayı giriniz: ");
            int a= scan.nextInt();
            sum += a;
            adet++;
        }
        System.out.println("Girilen sayı adedi: "+adet+"\nToplam : "+sum);
    }
}
