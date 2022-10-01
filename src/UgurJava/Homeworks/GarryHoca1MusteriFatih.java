package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca1MusteriFatih {
    /*
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin.
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin.*/
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("aldığınız ürünün adedini giriniz : ");
        int adet= input.nextInt();
        System.out.print("ürünün liste fiyatını giriniz : ");
        double fiyat= input.nextDouble();
        System.out.print("müşteri kartınız var mı ? ");
        char c = input.next().toUpperCase().charAt(0);
        double fatura = 0;

        if(c=='V') {
            if (adet>10) {
                fatura = adet * fiyat * 4 / 5;
            } else fatura = adet * fiyat * 17 / 20;
            System.out.println("fatura = "+fatura+" TL");
        } else if(c=='Y') {
            if (adet>10) {
                fatura = adet * fiyat * 17 / 20;
            } else fatura = adet * fiyat *9 / 10;
            System.out.println("fatura = "+fatura+" TL");
        } else System.out.println("hatalı giriş yaptınız, yeniden deneyiniz");
    }
}

