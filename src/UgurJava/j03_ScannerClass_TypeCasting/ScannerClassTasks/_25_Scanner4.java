package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _25_Scanner4 {
    public static void main(String[] args) {
    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */
        Scanner input= new Scanner(System.in);
        System.out.print("arabanızdaki kapı sayısını giriniz :");
        byte door= input.nextByte();
        System.out.println("door = " + door);
    }
}


