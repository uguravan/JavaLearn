package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12_HarfRakamOzel {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
	Scanner scan = new Scanner(System.in);
		System.out.print("bir metin giriniz: ");
		String str = scan.nextLine();
		int i=0, harf=0, rakam=0, ozelkarak=0;
		char c;
		while (i<str.length()){
			c = str.charAt(i);
			if (c>= 48 && c<=57){
				rakam++;
				i++;
			}else if((c>=65 && c<=90) || (c>=97 && c<=122)){
				harf++;
				i++;
			}else if (c>= 32 && c<=126){
				ozelkarak++;
				i++;
			}else {
				harf++;
				i++;
			}
		}
		System.out.println("Girilen metinde "+harf+" tane harf, "+rakam+" tane rakam, "+ozelkarak+" tane özel karakter bulunmaktadır. ");
	}
}
