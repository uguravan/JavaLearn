package UgurJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("saniye giriniz : ");
        int sn= input.nextInt();
        System.out.println(sn/3600+" saat "+((sn%3600)/60)+" dakika "+((sn%3600)%60)+" saniye");
    }
}
