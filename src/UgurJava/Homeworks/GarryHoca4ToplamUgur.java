package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca4ToplamUgur {
    /*
    Verilen iki sayinin (sifirdan büyük veya sifira esit) toplamini hesaplayan ve yazdiran bir Java programi yazin. Verilen tamsayilar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdirin.
    Ornek:
    INPUT :
            25
            46
    OUTPUT :
    Numaralarin Toplami:
            71*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        double d1= input.nextDouble();
        System.out.print("ikinci bir sayı giriniz : ");
        double d2= input.nextDouble();
        double toplam = d1+d2;
        if (d1>=Math.pow(10, 9) || d2>=Math.pow(10, 9) || toplam>=Math.pow(10, 9)){
            System.out.println("Overflow");
        } else System.out.print("Toplam = "+toplam);
    }
}