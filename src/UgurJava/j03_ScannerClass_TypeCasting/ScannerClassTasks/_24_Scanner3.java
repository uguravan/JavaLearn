package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _24_Scanner3 {
    public static void main(String[] args) {
     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */
        Scanner input= new Scanner(System.in);
        System.out.print("sevdiğiniz meyveyi giriniz :");
        String fruit= input.nextLine();
        System.out.println("fruit = " + fruit);
    }
}
