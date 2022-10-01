package UgurJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {
    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("saat giriniz : ");
        int saat= input.nextInt();
        System.out.print("dakika giriniz : ");
        int dk= input.nextInt();
        System.out.print("saniye giriniz : ");
        int sn= input.nextInt();
        System.out.println(saat*3600+dk*60+sn+" saniye");
    }
}
