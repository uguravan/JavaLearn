package UgurJava.j09_SwitchStatement.switchCaseTasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("1. gün Pazartesi");
                break;
            case 2:
                System.out.println("2. gün Salı");
                break;
            case 3:
                System.out.println("3. gün Çarşamba");
                break;
            case 4:
                System.out.println("4. gün Perşembe");
                break;
            case 5:
                System.out.println("5. güna Cuma");
                break;
            case 6:
                System.out.println("6. gün Cumartesi");
                break;
            case 7:
                System.out.println("7. gün Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
