package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca5SifreKoray {
    /*
            // Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
            // Kullanicidan bir sifre girmesini isteyin
            // Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
            // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir şifre giriniz : ");
        char ilk = input.next().charAt(0);

        if (ilk == 'A' || ilk == 'z') {
            System.out.println("Geçerli Şifre");
        }else System.out.println("Geçersiz Şifre");
    }
}