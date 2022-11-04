package UgurJava.interview;

import java.util.Scanner;

public class Task14Dividing {
    /*
14 -->> Write a method that can divide two numbers without using division operator
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir tamsayı giriniz: ");
        int num1= scan.nextInt();
        System.out.print("bir tamsayı giriniz: ");
        int num2= scan.nextInt();
        dividing(num1, num2);
    }
    public static void dividing(int num1, int num2) {
        int dividen= Math.max(num1, num2);
        int divider= Math.min(num1, num2);
        int division=0;
        int remainder=Math.max(num1, num2);

        while(remainder>=divider) {
            remainder = dividen-divider;
            division++;
            dividen -= divider;
        }
        System.out.println("dividen: "+Math.max(num1, num2)+" divider: "+Math.min(num1, num2)+" division: "+division+" remainder: "+remainder);
    }

}
