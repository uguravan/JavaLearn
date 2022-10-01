package UgurJava.j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */
        Scanner input= new Scanner(System.in);
        System.out.print("lütfen bir sayi giriniz : ");
        int num1= input.nextInt();
        System.out.print("lütfen bir sayi daha giriniz : ");
        int num2= input.nextInt();
        System.out.print("lütfen bir sayi daha giriniz : ");
        int num3= input.nextInt();
        System.out.print("lütfen bir sayi daha giriniz : ");
        int num4= input.nextInt();
        System.out.println("Girdiğiniz sayıların toplami = "+(num1+num2+num3+num4));
    }
}
