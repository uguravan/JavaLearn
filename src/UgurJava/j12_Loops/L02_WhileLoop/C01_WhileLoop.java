package UgurJava.j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    //
    public static void main(String[] args) {
        //Task01
        int a= 11;
        while (a<21){
            System.out.print(a+" ");
            a++;
        }

        //Task02
        int b= 1;
        while (b<8){
            System.out.print(" JAVACAN ");
            b++;
        }
        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz
        System.out.println("   *** task03 ***   ");
        b=11;
        while (b<100){
            //System.out.print(b+" ");
            // b+=2;//her iki artırmada b = 11,13 ... 99 surekli tek sayı verir
            if (b%2==1) System.out.print(b+" ");
            b++;
        }

        // task04-> girilen metni while loop ile  tersden print eden code create ediniz
        System.out.println("   *** task04 ***   ");

        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  metin= sc.nextLine();
        int metinUzunluk=metin.length();

        while (metinUzunluk>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;
        }

        System.out.println("bir metin giriniz : ");
        int  num= sc.nextInt();
        int sum = 0;

        while (num>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            sum += num;
            num--;
        }
        System.out.println(sum);

        System.out.println("bir metin giriniz : ");
        int  num1= sc.nextInt();
        int faktoriyel = 1;

        while (num1>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            faktoriyel *= num1;
            num1--;
        }
        System.out.println(faktoriyel);


    }
}
