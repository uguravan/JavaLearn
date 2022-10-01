package UgurJava.j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner scanner = new Scanner(System.in);
		System.out.print("saat giriniz: ");
		int saat = scanner.nextInt();
		System.out.print("kara mili giriniz: ");
		int mil = scanner.nextInt();
		System.out.print("kilogram giriniz: ");
		int kg = scanner.nextInt();

		ceviren(saat, mil, kg);
	}
	public static void ceviren(int s, int m, int k) {
		int saniye = s * 3600;
		double km = m * 1.609344;
		int gram = k * 1000;

		System.out.println("" + s + " saat = " + saniye + " saniye\n" + m + " kara mili = " + km + " kilometre\n" + k + " kg = " + gram + " gram");
	}
}
