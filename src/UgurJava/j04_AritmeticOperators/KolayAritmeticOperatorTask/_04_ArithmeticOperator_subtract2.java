package UgurJava.j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */
        Scanner input= new Scanner(System.in);
        System.out.print("lütfen bir sayi giriniz : ");
        int num1= input.nextInt();
        System.out.print("lütfen bir sayi daha giriniz : ");
        int num2= input.nextInt();
        System.out.print("lütfen bir sayi daha giriniz : ");
        int num3= input.nextInt();
        System.out.print("lütfen bir sayi daha giriniz : ");
        int num4= input.nextInt();
        System.out.println("Girdiğiniz sayıların toplami = "+(num1-num2-num3-num4));
    }
}
