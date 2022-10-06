package UgurJava.j12_Loops.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
       /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz. ");
        int bir = scan.nextInt();
        System.out.println("bir sayı daha giriniz. ");
        int iki = scan.nextInt();

        if (iki > bir) {
            for (int i = bir; i <= iki; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                }
            }
        }else if (iki < bir) {
            for (int i = iki; i <= bir; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                }
            }
        }else System.out.println("agam ikisi de aynı, nettin? ");

        for (int i=(bir<iki?bir:iki);i<=(bir<iki?iki:bir);i++ ){//ternary alternatif
            System.out.print(i%2==0?i:" ");
        }
    }
}
