package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _26_Scanner5 {
    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */
        Scanner input= new Scanner(System.in);
        System.out.print("10 sene önceki yaşadığınız şehri giriniz :");
        String city= input.nextLine();
        System.out.println("city = " + city);
    }
}
