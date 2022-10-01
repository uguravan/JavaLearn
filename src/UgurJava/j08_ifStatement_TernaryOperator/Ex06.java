package UgurJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner (System.in);
        System.out.println("yaşınızı giriniz : ");
        int d1 = scan.nextInt();
        System.out.println("prim gününü giriniz : ");
        int d2 = scan.nextInt();
        System.out.println("cinsiyetinizi erkek için E, kadın için K giriniz");
        char cins = scan.next().charAt(0);

        if (cins == 'K') {
            if (d1>60) {
                if (d2>=6000) {
                    System.out.println(" emekli olabilirsiniz. ");
                }else System.out.println("prim gününüz "+(6000-d2)+" gün eksiktir.");
            }else System.out.println("emekli olmak için "+(60-d1)+" yaş küçüksünüz");
        }else if (cins == 'E') {
            if (d1>65) {
                if (d2>=7000) {
                    System.out.println(" emekli olabilirsiniz. ");
                }else System.out.println("prim gününüz "+(7000-d2)+" gün eksiktir.");
            }else System.out.println("emekli olmak için "+(65-d1)+" yaş küçüksünüz");
        } else System.out.println("doğru cinsiyet giriniz");

*/
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz..
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("cinsiyetiniz \n KADIN için-> K\n ERKEK için-> E\n giriniz : ");
        char cnsyt = sc.next().charAt(0);

        if (cnsyt == 'K') {//cinsiyetin kadın olması kontrol edildi
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 60) {//yasın 60 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();
                if (primGunu > 6000) {//prim gunu 6000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler NİNEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (6000 - primGunu) + " gun  yatırmanız lazım");
            } else System.out.println("emekliliğinize daha : " + (60 - yas) + " yıl daha var");
        } else if (cnsyt == 'E') {
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 65) {//yasın 65 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();
                if (primGunu > 7000) {//prim gunu 7000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler DEDEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (7000 - primGunu) + " yatırmanız lazım");
            } else System.out.println("emekliliğinize daha : " + (65 - yas) + " yıl daha var");
        } else System.out.println("agam ne oldugunu yaz ona göre emekli edeyim seni :( ");
    }
}
