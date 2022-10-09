package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10_TekSayılar {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("bir tamsayı giriniz: ");
        int a=scan.nextInt();
        int i=0;

        while (i<=a){
            System.out.print((i%2==1)? i : " " );
            i++;
        }
    }
}
