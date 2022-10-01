package UgurJava.j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {

        // TASK -> kullanıcının girdiği yılın ay sırqsına göre ayın ismin print eden code create ediniz

        Scanner input = new Scanner (System.in);
        System.out.println("Bir ay sayısı giriniz : ");
        byte ay = input.nextByte();
        switch (ay) {
            case 1 : System.out.println(" OCAK");break;
            case 2 : System.out.println(" ŞUBAT");break;
            case 3 : System.out.println(" MART");break;
            case 4 : System.out.println(" NİSAN");break;
            case 5 : System.out.println(" MAYIS");break;
            case 6 : System.out.println(" HAZİRAN");break;
            case 7 : System.out.println(" TEMMUZ");break;
            case 8 : System.out.println(" AĞUSTOS");break;
            case 9 : System.out.println(" EYLÜL");break;
            case 10 : System.out.println(" EKİM");break;
            case 11 : System.out.println(" KASIM");break;
            case 12 : System.out.println(" ARALIK");break;
            default : System.out.println(" Hatalı giriş yaptınız");break;
        }
    }
}
