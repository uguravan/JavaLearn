package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07_5sayınınMax {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner scan = new Scanner(System.in);
        int max=0;
        int i=1;
        int girilensayi;

        while (i<=5){
            System.out.print(i+". sayıyı giriniz: ");
            girilensayi= scan.nextInt();
            max= Math.max(max, girilensayi);
            i++;
        }
        System.out.println("max = " + max);
    }
}
