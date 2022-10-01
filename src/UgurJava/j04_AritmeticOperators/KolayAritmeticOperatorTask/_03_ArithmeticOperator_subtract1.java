package UgurJava.j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */
        Scanner input= new Scanner(System.in);
        System.out.print("lütfen bir sayi giriniz : ");
        int num1= input.nextInt();
        System.out.print("lütfen bir sayi daha giriniz : ");
        int num2= input.nextInt();
        System.out.println("Girdiğiniz sayıların farkı = "+(num1-num2));
    }
}
