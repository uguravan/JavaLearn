package UgurJava.j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" adınızı ve soyadınızı giriniz. ");
        String isim = scanner.nextLine();
    }
    public static void harf(String isim) {
        System.out.println(isim.trim().toUpperCase().substring(1, isim.indexOf("")).replaceAll("\\w", "*")+"\n"+
                isim.trim().toUpperCase().substring(isim.indexOf("")+2).replaceAll("\\w", "*"));
    }*/
    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz


        Scanner sc =new Scanner(System.in);
        System.out.print("adınızı giriniz : ");
        String  ad= sc.next();

        System.out.print("soyadınızı giriniz : ");
        String  soyad= sc.next();

        isimSoyisimHarfKontrol(ad, soyad);
        System.out.println(isimSoyisimHarfKontrol2(ad, soyad));


    }//main sonu

    private static void isimSoyisimHarfKontrol(String ad, String soyad) {

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad  soyad = " + ad + " " + soyad);
    }

    private static String isimSoyisimHarfKontrol2(String ad, String soyad) {//return typle method
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

        return ad+" "+soyad;
    }
}
