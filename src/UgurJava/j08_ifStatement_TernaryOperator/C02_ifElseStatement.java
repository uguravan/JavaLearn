package UgurJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int sayi = input.nextInt();
        if (sayi > 0) System.out.println("pozitif");
        else if (sayi < 0) System.out.println("negatif");
        else System.out.println("nötr");
         */
                /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..


        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = sc.nextInt();
        if (sayi > 0) {//sayinin sıfırdan buyuk olması şarta baglandı
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {//sayinin sıfırdan buyuk olmaması halinde sıfırdan kucuk olamsı sarta baglandı
            System.out.println("girilen sayi negatif");
        } else {//syının sıfırdan buyuk veya kucuk olmaması halıinde kalan durum(sıfıra eşit olması) şarta bağlandı
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("notu giriniz : ");
        int not = input.nextInt();
        if (not <= 100 && not>= 0) {
            char harf = not >= 80 ? 'A' : (not >= 60 ? 'B' : (not >= 50 ? 'C' : 'D'));
            System.out.println("Notunuz : " + harf);
        } else System.out.println("yanlış not girdiniz, yeniden deneyiniz. ");
*/
        Scanner input = new Scanner(System.in);
        System.out.println("yılı giriniz : ");
        int year = input.nextInt();
        String artyear = year%4==0 ? (year%400==0 ? "Artık yıl" : (year%100==0 ? "Artık yıl değil" : "Artık yıl" )) : "Artık yıl değil";
        System.out.println(artyear);
    }
    }
