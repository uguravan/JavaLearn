package UgurJava.j13_Break_Continue.HaftanınTaskiii.HaftanınTaskiii;

import java.util.Scanner;

public class T03_TasKagitMakas {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// tas >makas
		// makas >kagit
		//kagit >tas
		int numberOfFirstWin = 0;
		int numberOfSecondWin = 0;
		int numberOfComWin = 0;
		int gameOver = 3;

		while (numberOfFirstWin < gameOver){
			System.out.println("1.Oyuncu: Taş için: 1 -  Kağıt için: 2 -  Makas için: 3 seçiniz  ");
			int secim1= scan.nextInt();
			System.out.println("1.Oyuncu: Taş için: 1 -  Kağıt için: 2 -  Makas için: 3 seçiniz  ");
			int secim2= scan.nextInt();

			if (secim1 == secim2){
				System.out.println("Berabere ");
			}else if ((secim1==1 && secim2==3) || (secim1==2 && secim2==1) || (secim1==3 && secim2==2)){
				System.out.println("1.Oyuncu kazandı ");
				numberOfFirstWin++;
			}else {
				System.out.println("2.Oyuncu kazandı ");
				numberOfSecondWin++;
			}
		}

		if (numberOfFirstWin == 3) {
			System.out.println("==GAME OVER==");
			System.out.println("TEBRİKLER! 1.Oyuncu kazandı, kazanma sayısı: " + numberOfFirstWin);
			System.out.println("2.Oyuncu kaybetti kazanma sayısı: " + numberOfSecondWin);
		} else if (numberOfComWin == 3) {
			System.out.println("==GAME OVER==");
			System.out.println("TEBRİKLER! 2.Oyuncu kazandı, kazanma sayısı: " + numberOfSecondWin);
			System.out.println("1.Oyuncu kaybetti kazanma sayısı: " + numberOfFirstWin);
		}
	}
}
