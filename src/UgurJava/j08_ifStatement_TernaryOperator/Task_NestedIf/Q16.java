package UgurJava.j08_ifStatement_TernaryOperator.Task_NestedIf;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    public static void main(String[] args) {
        /*
        Scanner input= new Scanner(System.in);
        System.out.print("bir tamsayı giriniz : ");
        int num1= input.nextInt();
        System.out.print("ikinci bir tamsayı giriniz : ");
        int num2= input.nextInt();
        System.out.print("üçüncü bir tamsayı giriniz : ");
        int num3= input.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("Max = "+max+"   Min = "+min);
        */
        Scanner input = new Scanner(System.in);
        System.out.println("arka arkaya adet sayi girin");
        System.out.println("girdiginiz bu 3 sayinin en buyuk olanini ve en kucuk olanini bulup cikti alacağız");
        int maks=0;
        int min=0;

        for (int i=1; i<=3; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = input.nextInt();

            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }
            if (sayi>maks)
                maks=sayi;
            if (sayi<min)
                min=sayi;
        }
        System.out.println("girdiginiz 3 sayi icinden en buyuk olani: "+maks);
        System.out.println("girdiginiz 3 sayi icinden en kucuk olani: "+min);
    }
}

