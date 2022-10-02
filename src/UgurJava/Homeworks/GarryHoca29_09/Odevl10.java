package UgurJava.Homeworks.GarryHoca29_09;

import java.util.Scanner;

public class Odevl10 {
    /*
            10-    	Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
    Girilen kelime cumlede kullanilmamis.
    Girilen kelime cumlede 1 kere kullanilmis.
    Girilen kelime cumlede 1’den fazla kullanilmis. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir cümle giriniz: ");
        String cumle = scan.nextLine().toLowerCase().trim();
        System.out.print("bir kelime giriniz: ");
        String kelime = scan.next().toLowerCase().trim();

        if (cumle.indexOf(kelime) > -1) {
            if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
                System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
            } else System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        } else System.out.println("Girilen kelime cumlede kullanilmamis.");
        scan.close();
    }
}
