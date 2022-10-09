package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

    int random= (int)(Math.random()*100)+1;
    Scanner scan = new Scanner(System.in);
    System.out.print("bilgisayarın 1 ile 100 arasında tuttuğu sayıyı tahmin ediniz: ");
    int tahmin=scan.nextInt();
    int tahminadedi=1;

    while (tahmin!=random) {
        if (tahmin<random) {
            System.out.print("Tahmininizi büyüterek giriniz: ");
            tahmin=scan.nextInt();
            tahminadedi++;
        }else {
            System.out.print("Tahmininizi küçülterek giriniz: ");
            tahmin=scan.nextInt();
            tahminadedi++;
        }
        }
        System.out.println("TEBRİKLER! "+tahminadedi+" tahminde sayıyı buldunuz. ");
    }
}
