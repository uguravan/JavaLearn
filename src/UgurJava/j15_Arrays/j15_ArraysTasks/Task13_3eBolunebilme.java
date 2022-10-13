package UgurJava.j15_Arrays.j15_ArraysTasks;

import java.util.Scanner;

public class Task13_3eBolunebilme {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner scan = new Scanner(System.in);
        int num[] = new int[8];
        for (int i = 0; i <8 ; i++) {
            System.out.print("bir sayı giriniz: ");
            num[i] = scan.nextInt();
        }
        int count=0;
        for (int i = 0; i <8 ; i++) {
            if (num[i]%3==0) count++;
        }
        System.out.println("3 e bolunebilen sayi adedi: "+count);
    }
}
