package UgurJava.j09_SwitchStatement.switchCaseTasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Ocak: 1\nŞubat : 2\nMart: 3\nNisan: 4\nMayıs: 5\nHaziran: 6\nTemmuz: 7\nAğustos: 8\nEylül : 9\nEkim: 10\nKasım: 11\nAralık: 12\nBir Ay Giriniz  : ");
		int ayNo = sc.nextInt();
		switch (ayNo) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Girilen ay 31 gün içerir");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Girilen ay 30 gün içerir");
				break;
			case 2:
				System.out.print("yılınızı giriniz : ");
				int yil = sc.nextInt();
				if (yil % 4 == 0) {
					System.out.println("Bu yıl Şubat ayı 29 gün içerir ");
				} else System.out.println("Bu yıl Şubat ayı 28 gün içerir");
				break;
			default:
				System.out.println("Hatalı Giriş :( "); break;
		}
	}
}
