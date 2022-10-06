package UgurJava.j11_MethodCreation;

import java.util.Scanner;

public class TaskKelimeOyunu {
        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */
    static Scanner scan = new Scanner(System.in);
    static int puan1 = 0;
    static int puan2 = 0;
    static String word1;
    static String word2;
    static int oyuncuNo = 1;

    public static void main(String[] args) {
        System.out.print("1.oyuncu! bir kelime giriniz: ");
        word1 = scan.next().trim();
        firststage();
    }
    public static void firststage() {
        System.out.print("1.oyuncunun girdiği kelimeyi kabul ediyormusunuz: <E>vet - <H>ayır ");
        char c = scan.next().toUpperCase().trim().charAt(0);

        switch (c){
            case 'E':
                puan1 += word1.length();
                oyuncuNo = 2;
                thirdStage();
                break;
            case 'H':
                System.out.print("Geçersiz kelime "+oyuncuNo+".oyuncu oyunu kazanmıştır. "); break;
            default:
                System.out.println("Hatalı Giriş Yaptınız"); firststage(); break;
        }
    }
    public static void secondStage(){
        System.out.print(oyuncuNo+".oyuncunun girdiği kelimeyi kabul ediyormusunuz: <E>vet - <H>ayır ");
        char c = scan.next().toUpperCase().trim().charAt(0);

        if (oyuncuNo==1) {
            puan1 += word2.length();
        }else puan2 += word2.length();

        switch (c){

            case 'E':
                if (oyuncuNo==1) {
                    oyuncuNo++;
                    thirdStage();
                }else {
                    oyuncuNo--;
                    thirdStage();
                }break;

            case 'H':
                System.out.println("oyun bitti");
                System.out.println("metnin son hali: "+word1);
                System.out.println("1.oyuncunun puanı : "+puan1+"\n2.oyunucunun puanı : "+puan2);
                if (puan1 > puan2) {
                    System.out.print("Tebrikler 1.oyuncu kazandı. ");
                }else if (puan2>puan1) {
                    System.out.print("Tebrikler 2.oyuncu kazandı. ");
                }else System.out.print("Berabere"); break;

            default:
                System.out.println("Hatalı Giriş Yaptınız"); secondStage(); break;
        }
    }
    public static void thirdStage(){
        System.out.print(oyuncuNo+".oyuncu! devam etmek istiyor musunuz: <E>vet - <H>ayır ");
        char devam = scan.next().toUpperCase().trim().charAt(0);

        switch (devam){
            case 'E':
                System.out.print(oyuncuNo+".oyuncu! kelimeye eklemek istediginiz string'i giriniz: ");
                word2 = scan.next().trim();

                System.out.print("girdiğiniz kelimeyi bir önceki stringin önüne mi arkasına mı ekleyeyim: <ö>nü - <a>rkası ");
                char c = scan.next().toLowerCase().trim().charAt(0);

                if (c == 'ö') {
                    word1 = word2.concat(word1);
                } else {
                    word1 = word1.concat(word2);
                }

                secondStage(); break;

            case 'H':
                System.out.println("oyun bitti");
                System.out.println("metnin son hali: "+word1);
                System.out.println("1.oyuncunun puanı : "+puan1+"\n2.oyunucunun puanı : "+puan2);
                if (puan1 > puan2) {
                    System.out.print("Tebrikler 1.oyuncu kazandı. ");
                }else if (puan2>puan1) {
                    System.out.print("Tebrikler 2.oyuncu kazandı. ");
                }else System.out.print("Berabere"); break;

            default:
                System.out.println("Hatalı Giriş Yaptınız"); thirdStage();break;
        }
    }
}
