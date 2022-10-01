package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bölümünü bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner input= new Scanner(System.in);
        System.out.print("bir tamsayı giriniz : ");
        double a= input.nextInt();
        System.out.print("ikinci bir tamsayı giriniz : ");
        double b= input.nextInt();
        System.out.print("üçüncü bir tamsayı giriniz : ");
        double c= input.nextInt();
        System.out.print("sonuç: "+((a*a-b*b)/(3*c)));
    }
}
