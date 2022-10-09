package UgurJava.j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    //
    public static void main(String[] args) {
        // task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        int flag=0;
        int a=1;
        while (a<=sayi) {
            if (sayi%a==0) {
                System.out.print(a + " ");
                flag++;
            }
            a++;
        }
        System.out.println("\n"+flag);
        if (flag==2) System.out.println("asal sayı = " + sayi);


        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        int bolenSayi=1;
        int tamBolenAdedi=0;
        while (bolenSayi<=sayi){
            if (sayi%bolenSayi==0){//sayi bolenSayıya tam bölünme şartı
                tamBolenAdedi++;

            }
            bolenSayi++;//lopp sonsuza düşmemesi için ve diğer sayılarun böldüğü kontrol edilmesi için yazıldı
        }
        System.out.println("agam girdiğin "+sayi+" nın "+tamBolenAdedi+" kadar tam boleni var :)");*/

    }
}