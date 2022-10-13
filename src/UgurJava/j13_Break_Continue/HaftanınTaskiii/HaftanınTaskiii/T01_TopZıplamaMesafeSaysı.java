package UgurJava.j13_Break_Continue.HaftanınTaskiii.HaftanınTaskiii;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("topun bırakıldığı yüksekliği giriniz: ");
        double h= scan.nextDouble();
        double sum=0;
        int zıplama=0;

        do {
            sum += h+ 3*h/4;
            zıplama++;
            h *=(0.75);
            if (h<1) break;
        }while (h>0);
        System.out.println("toplam yol: " + sum+"\nyere vurma sayısı: " + zıplama);
    }
}
