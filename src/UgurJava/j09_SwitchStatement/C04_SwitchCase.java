package UgurJava.j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir ay gir bakam  : ");
        int ayNo = sc.nextInt();
        switch (ayNo) {
            case 1:
            case 2:
            case 12:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("agam sizin köyde bir yılda kaç ay var "); break;
        }
    }
}
