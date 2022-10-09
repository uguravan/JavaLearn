package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("isminizi giriniz: ");
		String ad=scan.nextLine().trim();
		System.out.print("soyisminizi giriniz: ");
		String soyad=scan.nextLine().toUpperCase().trim();
		String bileşik= (ad+soyad).replaceAll("\\s+", "").trim();
		int i=0;
		while (i<bileşik.length()){
			System.out.print(bileşik.charAt(i)+" ");
			i++;
		}
	}

}
