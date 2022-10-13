package UgurJava.j15_Arrays.j15_ArraysTasks;

import java.util.Scanner;

public class Task09_girisSırasıTersten {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        int num[] = new int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.print("bir sayı giriniz: ");
            num[i] = scan.nextInt();
        }
        for (int i = 4; i >=0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
