package UgurJava.j12_Loops.TasksUgur;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("faktöriyelini almak istediğiniz sayıyı giriniz: ");
        int f= scan.nextInt();

        faktoriyel(f);
    }
    public static void faktoriyel(int f) {
        int sum = 1;
        for (int i=1; i<=f ; i++) {
            sum *= i;
        }
        System.out.println(f+"! = "+sum);
    }
}
