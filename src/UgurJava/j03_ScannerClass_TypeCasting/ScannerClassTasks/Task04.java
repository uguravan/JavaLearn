package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner input= new Scanner(System.in);
        System.out.print("adınızı giriniz : ");
        String ad= input.nextLine();
        System.out.print("soyadınızı giriniz : ");
        String soyad= input.nextLine();
        System.out.print("yaşnızı giriniz : ");
        int yas= input.nextInt();
        System.out.print("kg cinsinden ağırlığınızı yazınız : ");
        int kilo= input.nextInt();
        System.out.print("boyunuzu kaç cm : ");
        int boy= input.nextInt();
        System.out.print("salona kaç ay devam edeceksiniz ? ");
        int ay= input.nextInt();
        System.out.println("Sayın "+ad+" "+soyad+" salon ücretiniz = "+ay*20+"$");
    }
}
