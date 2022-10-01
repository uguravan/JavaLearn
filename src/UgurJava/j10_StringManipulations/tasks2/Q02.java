package UgurJava.j10_StringManipulations.tasks2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

        Scanner scanner = new Scanner(System.in);
        System.out.println("şifrenizi giriniz : ");
        String pass = scanner.nextLine();
        if (pass.charAt(0) >= 'A' && pass.charAt(0) <= 'Z' && pass.charAt(pass.length()-1) >='0' && pass.charAt(pass.length()-1) <='9' && pass.length() >= 6) {
            System.out.println("password geçerli");
        } else System.out.println("password geçersiz");
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("password girişi yapınız : ");
        String password = sc.nextLine();

        if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&(password.charAt(password.length()-1)>='0'&&
                password.charAt(password.length()-1)<='9')&&(password.length()>=6)) {
            System.out.println("password geçerli");
        }else System.out.println("password geçersiz");
    }
}
