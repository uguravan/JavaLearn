package UgurJava.j13_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
  /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

    // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.print("mail adresinizi giriniz: ");
    String mail = scan.nextLine();
    char c;
    for (int i = 0; i < mail.length(); i++) {
        c=mail.charAt(i);
        if (c == ' ') continue;
        System.out.print(c);
    }
}
}
