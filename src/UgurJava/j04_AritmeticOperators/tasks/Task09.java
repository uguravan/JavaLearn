package UgurJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {
    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Çiftlikteki inek sayısını giriniz : ");
        int inek= input.nextInt();
        System.out.print("Çiftlikteki koyun sayısını giriniz : ");
        int koyun= input.nextInt();
        System.out.print("Çiftlikteki tavuk sayısını giriniz : ");
        int tav= input.nextInt();
        System.out.println("Çiftlikteki hayvanların ayaklarının toplam sayısı = "+((inek+koyun)*4+tav*2));
    }
}
