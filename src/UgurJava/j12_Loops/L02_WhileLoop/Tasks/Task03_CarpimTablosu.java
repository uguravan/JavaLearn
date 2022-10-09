package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03_CarpimTablosu {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("çarpım tablosu için bir tamsayı giriniz: ");
		int num = scan.nextInt();
		int a = 1;

		while (a<=10){
			System.out.println(num+"*"+a+"="+(num*a));
			a++;
		}

	}

}
