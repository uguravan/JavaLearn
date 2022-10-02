package UgurJava.Homeworks.GarryHoca29_09;

import java.util.Scanner;

public class Odevl8 {
    /*
        8- 		Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
    isim-soyisim : M***** B*******
    kart no : **** **** **** 1234 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("isim ve soyisim giriniz : ");
        String adSoyad = scan.nextLine().trim();
        System.out.print("16 haneli kredi kart no giriniz: ");
        long kredi = scan.nextLong();

        String yeniad = adSoyad.toUpperCase().charAt(0)+adSoyad.substring(1,adSoyad.indexOf(" ")).replaceAll("\\w","*")+" "+adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1)+adSoyad.substring(adSoyad.indexOf(" ")+2).replaceAll("\\w","*");
        String yenikart = String.valueOf(kredi);
        yenikart = yenikart.substring(0,12).replaceAll("\\d","*")+yenikart.substring(12);
        System.out.println(yeniad);
        System.out.println(yenikart);
        scan.close();
    }

}
