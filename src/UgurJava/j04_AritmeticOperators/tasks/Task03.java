package UgurJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.*/
		Scanner input= new Scanner(System.in);
		System.out.print("3 basamakli bir sayi giriniz : ");
		int sayi= input.nextInt();
		System.out.println("ilk ve son rakamlarinin toplami = "+((sayi/100)+sayi%10));
	}
}
