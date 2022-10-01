package UgurJava.j10_StringManipulations.StringManipulationTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz : ");
        String adsoyad = sc.nextLine();
        adsoyad = adsoyad.trim();

        if (adsoyad.contains(" ") && adsoyad.indexOf(" ") == adsoyad.lastIndexOf(" ")) {
            String ad = adsoyad.substring(0, adsoyad.indexOf(" "));
            String soyad = adsoyad.substring(adsoyad.indexOf(" ") + 1);
            System.out.println("Adı: "+ad+"\nSoyadı: "+soyad);
        }else System.out.println("Hatalı giriş yaptınız.");
    }
}
