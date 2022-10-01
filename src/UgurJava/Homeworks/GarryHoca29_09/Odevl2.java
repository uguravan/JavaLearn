package UgurJava.Homeworks.GarryHoca29_09;

import java.util.Scanner;

public class Odevl2 {
    /*
        2-      Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
    ad ayri soyad ayri sekilde ekrana yazdiriniz.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ad ve soyadınızı giriniz");
        String s = scan.nextLine().trim();
        if (s.indexOf(' ') == s.lastIndexOf(' ')) {
            System.out.println("Ad: " + s.substring(0, s.indexOf(' ')) + "\nSoyad: " + s.substring(s.indexOf(' ') + 1));
        }
        scan.close();
    }

}
