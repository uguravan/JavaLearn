package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca6EmeklilikFatih {
    /*
            // Kullanicidan cinsiyet ve yas aliniz
            // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
            // calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
            // emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin*/
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("yaşınızı giriniz : ");
        int d1 = scan.nextInt();
        System.out.println("cinsiyetinizi erkek için E, kadın için K giriniz");
        char cins = scan.next().charAt(0);

        if (cins == 'K') {
            if (d1>60) {
               System.out.println(" emekli olabilirsiniz. ");
            }else System.out.println("emekli olmak için "+(60-d1)+" yaş küçüksünüz");
        }else if (cins == 'E') {
            if (d1>65) {
                System.out.println(" emekli olabilirsiniz. ");
            }else System.out.println("emekli olmak için "+(65-d1)+" yaş küçüksünüz");
        } else System.out.println("doğru cinsiyet giriniz");
    }
}