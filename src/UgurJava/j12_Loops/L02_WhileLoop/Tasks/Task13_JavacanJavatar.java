package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13_JavacanJavatar {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
    Scanner scan = new Scanner(System.in);
    System.out.print("bir karakter giriniz: ");
    char c= scan.next().charAt(0);

    if (c!='x' && c!='X') {
        while (c != 'x' && c != 'X') {
            System.out.println("javaCAN ");
            System.out.print("bir karakter giriniz: ");
            c= scan.next().charAt(0);
        }
    }
    System.out.print("jAVATAR");
    }
}
