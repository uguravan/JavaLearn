package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _23_Scanner2 {
    public static void main(String[] args) {
    /*   kullanıcının yasını print eden code create ediniz  */
        Scanner input= new Scanner(System.in);
        System.out.print("yaşnızı giriniz :");
        int age= input.nextInt();
        System.out.println("age = " + age);
    }
}
