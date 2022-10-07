package UgurJava.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev09 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Tamkareler toplamı için 1'den büyük bir tamsayı giriniz: ");
        int num = scan.nextInt();
        int toplam = 0;

        for (int i = 1; i <= num; i++) {
            toplam += (i * i);
        }
        System.out.println("Sayıların kareleri toplamı: " + toplam);
        scan.close();
    }
}
