package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _27_Scanner6 {
    public static void main(String[] args) {
    /*    kullanıcının Doğum gününü print eden code create ediniz */
        Scanner input= new Scanner(System.in);
        System.out.print("doğum gününüzü giriniz :");
        String birthday= input.nextLine();
        System.out.println("birthday = " + birthday);
    }
}
