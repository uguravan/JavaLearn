package UgurJava.j10_StringManipulations.StringManipulationTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("3 kelimeden oluşan bir isim giriniz : ");
        String isim = sc.nextLine().toUpperCase().trim();

        if (isim.indexOf(' ') != isim.lastIndexOf(' ')) {
            String kısaltma = isim.charAt(0) + "." + isim.charAt(isim.indexOf(' ') + 1) + "." + isim.charAt(isim.lastIndexOf(' ') + 1);
            System.out.println(kısaltma);
        }
    }
}