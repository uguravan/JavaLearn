package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		Scanner input= new Scanner(System.in);
		System.out.print("bir tamsayı giriniz : ");
		int sayi1= input.nextInt();
		System.out.print("ikinci bir tamsayı giriniz : ");
		int sayi2= input.nextInt();
		System.out.println("Toplama Sonucu: "+(sayi1+sayi2)+"\nÇıkarma Sonucu: "+(sayi1-sayi2)+"\nÇarpma Sonucu: "+(sayi1*sayi2)+"\nBölme Sonucu: "+(sayi1/sayi2));
	}
}
