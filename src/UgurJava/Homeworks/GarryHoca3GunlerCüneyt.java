package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca3GunlerCüneyt {
    /*
     * Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
     * baslayan gun isimlerini yazdirin Ornek: ilkHarf=P output = “Pazar, Pazartesi
     * veya Persembe” ilkHarf=S output = “Sali” Buyuk kucuk harf problem olmamasi
     * icin toUpperCase methodunu kullanin*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gün isimlerinden birinin ilk harfini giriniz : ");
        char gun = scan.next().toUpperCase().charAt(0);
        switch (gun) {
            case 'P':
                System.out.println("Pazar, Pazartesi veya Perşembe");
                break;
            case 'S':
                System.out.println("Sali");
                break;
            case 'Ç':
                System.out.println("Çarşamba");
                break;
            case 'C':
                System.out.println("Cuma, Cumartesi");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
                break;
        }
    }
}
