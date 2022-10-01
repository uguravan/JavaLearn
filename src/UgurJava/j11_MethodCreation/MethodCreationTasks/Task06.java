package UgurJava.j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("<p>aralelkenar, <d>ikdörtgen ve <ü>çgen kelimelerinden birini seçiniz: ");
		String secim = scanner.next().trim().toLowerCase().substring(0,1);
		int a=0, b=0;

		if (secim.equals("p")) {
			paralelKenar(a, b);
		}else if (secim.equals("ü")) {
			ucgen(a, b);
		}else if (secim.equals("d")) {
			dikdörtgen(a, b);
		}else System.out.println("Hatalı giriş ");
	}
	public static void paralelKenar(int paralelh, int paralelt) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("paralelkenarın yüksekliğini giriniz: ");
		paralelh = scanner.nextInt();
		System.out.print("paralelkenarın taban uzunluğunu giriniz: ");
		paralelt = scanner.nextInt();
		System.out.println("paralelkenarın alanı = "+(paralelh * paralelt));
	}
	public static void ucgen(int ucgenh, int ucgent) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("üçgenin yüksekliğini giriniz: ");
		ucgenh = scanner.nextInt();
		System.out.print("üçgenin taban uzunluğunu giriniz: ");
		ucgent = scanner.nextInt();
		System.out.println("üçgenin alanı = "+(ucgenh * ucgent/2));
	}
	public static void dikdörtgen(int dik1, int dik2) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("dikdörtgenin kısa kenar uzunluğunu giriniz: ");
		dik1 = scanner.nextInt();
		System.out.print("dikdörtgenin uzun kenar uzunluğunu giriniz: ");
		dik2 = scanner.nextInt();
		System.out.println("dikdörtgenin alanı = "+(dik1 * dik2)+"\ndikdörtgenin çevresi = "+((dik2 + dik1)*2));
	}
}
