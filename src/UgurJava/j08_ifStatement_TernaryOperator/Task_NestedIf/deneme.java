package UgurJava.j08_ifStatement_TernaryOperator.Task_NestedIf;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        /* Kullanicidan isim isteyin. Eger;
		-  isim "a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		-  isim "Z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		isim a veya Z içermiyorsa “Girdiginiz isim a veya Z harfi iceriyor”
		*/
        Scanner scan = new Scanner(System.in);
        System.out.print("bir isim giriniz : ");
        String s = scan.nextLine();

        if (s.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (s.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        } else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        scan.close();

    }
}
