package UgurJava.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bir metin giriniz: ");
		String s= scan.nextLine().trim();

		int rakam =0;
		for (int i=0 ; i<s.length() ; i++) {
			if	(s.charAt(i) >= 48 && s.charAt(i) <= 57) rakam++;
		}
		System.out.println(rakam+" tane rakam var.");
		scan.close();
	}
}
