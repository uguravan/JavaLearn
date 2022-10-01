package UgurJava.j09_SwitchStatement.switchCaseTasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..
        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = sayi / 100;

        if (sayi >= 100 && sayi <= 999) {
            switch (yuzler) {
                case 1:
                    System.out.print("Yüz ");
                    break;
                case 2:
                    System.out.print("İkiyüz ");
                    break;
                case 3:
                    System.out.print("Üçyüz ");
                    break;
                case 4:
                    System.out.print("Dörtyüz ");
                    break;
                case 5:
                    System.out.print("Beşyüz ");
                    break;
                case 6:
                    System.out.print("Altıyüz ");
                    break;
                case 7:
                    System.out.print("Yediyüz ");
                    break;
                case 8:
                    System.out.print("Sekizyüz ");
                    break;
                case 9:
                    System.out.print("Dokuzyüz ");
                    break;
            }
            switch (onlar) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kırk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmış");
                    break;
                case 7:
                    System.out.print("Yetmiş");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }
            switch (birler) {
                case 1:
                    System.out.print(" bir");
                    break;
                case 2:
                    System.out.print(" iki");
                    break;
                case 3:
                    System.out.print(" üç");
                    break;
                case 4:
                    System.out.print(" dört");
                    break;
                case 5:
                    System.out.print(" beş");
                    break;
                case 6:
                    System.out.print(" altı");
                    break;
                case 7:
                    System.out.print(" yedi");
                    break;
                case 8:
                    System.out.print(" sekiz");
                    break;
                case 9:
                    System.out.print(" dokuz");
                    break;
            }
        } else System.out.println("Hatalı giriş yaptınız. ");
    }
}
