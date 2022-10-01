package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        Scanner input= new Scanner(System.in);
        System.out.print("birinci dik kenar uzunluğunu giriniz : ");
        int dik1= input.nextInt();
        System.out.print("ikinci dik kenar uzunluğunu giriniz : ");
        int dik2= input.nextInt();
        System.out.print("hipotenüs: "+Math.sqrt(dik1*dik1+dik2*dik2));
    }
}
