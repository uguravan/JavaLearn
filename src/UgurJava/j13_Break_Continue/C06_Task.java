package UgurJava.j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
  /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

    // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.print("bir metin giriniz: ");
    String metin = scan.nextLine();
    int sayac=0;
    for (int i = 0; i < metin.length(); i++) {
        char c=metin.charAt(i);
        if (c == 'a') sayac++;
        if (c == 'c') break;
    }
    System.out.println(sayac);
}
}
