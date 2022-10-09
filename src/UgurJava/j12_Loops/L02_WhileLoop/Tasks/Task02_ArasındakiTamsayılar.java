package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02_ArasındakiTamsayılar {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int a=scan.nextInt();
        System.out.println("bir tamsayı giriniz: ");
        int b=scan.nextInt();

        if (a>b) {
            while (b < a-1) {
                System.out.print(++b+" ");
            }
        } else if (a < b) {
            while (a < b-1) {
                System.out.print(++a+" ");
            }
        }else System.out.println("ağam nettin sayılar eşit ");
    }
}
