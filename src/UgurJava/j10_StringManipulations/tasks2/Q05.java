package UgurJava.j10_StringManipulations.tasks2;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("adınızı giriniz: ");
        String ad = scanner.next();
        System.out.println("soyadınızı giriniz: ");
        String soyad = scanner.next();

        System.out.println(ad.toUpperCase().charAt(0)+ad.substring(1)+" "+soyad.toUpperCase().charAt(0)+soyad.substring(1));
    }
}
