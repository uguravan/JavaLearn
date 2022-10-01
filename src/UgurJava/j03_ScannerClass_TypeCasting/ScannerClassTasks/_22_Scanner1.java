package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _22_Scanner1 {
    public static void main(String[] args) {

    /*    kullanıcının ismini print eden code create ediniz */
        Scanner input= new Scanner(System.in);
        System.out.print("adınızı giriniz :");
        String name= input.nextLine();
        System.out.println("name = " + name);
    }
}
