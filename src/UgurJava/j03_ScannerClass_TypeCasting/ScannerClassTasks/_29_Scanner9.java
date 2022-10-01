package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _29_Scanner9 {
    public static void main(String[] args) {
    /*   kullanıcının boyunu
          Float print eden code create ediniz   */
        Scanner input= new Scanner(System.in);
        System.out.print("boyunuzu kaç metre :");
        float height= input.nextFloat();
        System.out.println("height = " + height);
    }
}
