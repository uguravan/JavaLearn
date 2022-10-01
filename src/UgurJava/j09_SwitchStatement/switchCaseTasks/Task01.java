package UgurJava.j09_SwitchStatement.switchCaseTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        sayi /= 10;
        sayi %= 10;

        switch (sayi) {
            case 0:
                System.out.println("Onlar basamağı SIFIR");
                break;
            case 1:
                System.out.println("Onlar basamağı BİR");
                break;
            case 2:
                System.out.println("Onlar basamağı İKİ");
                break;
            case 3:
                System.out.println("Onlar basamağı ÜÇ");
                break;
            case 4:
                System.out.println("Onlar basamağı DÖRT");
                break;
            case 5:
                System.out.println("Onlar basamağı BEŞ");
                break;
            case 6:
                System.out.println("Onlar basamağı ALTI");
                break;
            case 7:
                System.out.println("Onlar basamağı YEDİ");
                break;
            case 8:
                System.out.println("Onlar basamağı SEKİZ");
                break;
            case 9:
                System.out.println("Onlar basamağı DOKUZ");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
                break;
        }
    }
}
