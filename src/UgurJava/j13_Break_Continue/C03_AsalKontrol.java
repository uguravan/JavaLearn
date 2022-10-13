package UgurJava.j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("asal kontrol için bir tamsayı giriniz: ");
        int a = scan.nextInt();
        int checkasal=1;
        for (int i = 2; i <=a ; i++) {
            if (a%i==0) break;
            checkasal++;
        }
        System.out.println((checkasal==a-1)? "asal" : "asal değil");
    }
}
//task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bi dene tamsayı  giresen :");
        int sayi=sc.nextInt();// 23->2,3,4,5,6,7...23 24
        //     v x x          x -> false

        boolean asalMı=true;
        for (int i = 2; i < sayi; i++) {
        if (sayi%i==0){//eğer sayi kendisine kadar olan sayılara tam bölunuyorsa
        asalMı=false;
        break;
        }

        }
        if (asalMı){
        System.out.println("girilen sayı ASAL");
        }else System.out.println("girlen sayı asal DEGİL ");*/