package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner input= new Scanner(System.in);
        System.out.print("vize1 notunu giriniz : ");
        int vize1= input.nextInt();

        System.out.print("vize2 notunu giriniz : ");
        int vize2= input.nextInt();

        System.out.print("final notunu giriniz : ");
        int fin= input.nextInt();

        double grade= (3*(vize1+vize2)/20)+(7*fin/10);
        System.out.println("Your grade is : " + grade);
    }
}
