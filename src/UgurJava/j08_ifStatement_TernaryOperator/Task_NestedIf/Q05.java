package UgurJava.j08_ifStatement_TernaryOperator.Task_NestedIf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner input= new Scanner(System.in);
        System.out.print("yaşnızı giriniz : ");
        int age= input.nextInt();
        if (age>18) {
            System.out.print("kg cinsinden ağırlığınızı yazınız : ");
            int kilo = input.nextInt();
            if (kilo < 50) {
                System.out.println("kan bağışı yapamaz. ");
            } else System.out.println("kan bağışı yapabilir. ");
        } else System.out.println("kan bağışı yapamaz. ");
    }
}
