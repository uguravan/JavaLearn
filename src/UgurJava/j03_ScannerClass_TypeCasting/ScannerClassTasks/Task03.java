package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner input= new Scanner(System.in);
        System.out.print("gunde kac saat uyuyorsunuz ? ");
        int uyku= input.nextInt();
        System.out.println("Ayda: " + uyku*30/24+", Yilda: " + uyku*365/24+", 40 Yilda: " + uyku*365*40/24+" gününüz uykuda geçiyor.");
    }
}
