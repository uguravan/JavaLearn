package UgurJava.j13_Break_Continue.HaftanınTaskiiiHalukHoca;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Anagram kontrolü için ilk kelimeyi giriniz: ");
		String s1 = scan.nextLine().replaceAll("\\s", "").toLowerCase();
		System.out.print("Anagram kontrolü için ikinci kelimeyi giriniz: ");
		String s2 = scan.nextLine().replaceAll("\\s", "").toLowerCase();
/*
		if (Anagram(s1, s2)) {// NESTED FOR LOOP ile çözümü için
			System.out.println(s1+" ve "+s2+" Anagram");
		} else System.out.println(s1+" ve "+s2+" Anagram değil. ");
*/
		if (Anagram2(s1, s2)) {//ARRAY ile çözümü için
			System.out.println(s1+" ve "+s2+" Anagram");
		} else System.out.println(s1+" ve "+s2+" Anagram değil. ");
	}
	public static boolean Anagram(String s1, String s2) {//NESTED FOR LOOP İLE ÇÖZÜMÜ
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						s2 = s2.substring(0,j) + s2.substring(j + 1);
						break;
					}
				}
			}
			if (s2.length() == 0) {
				return true;
			}else return false;
		}return false;
	}
	public static boolean Anagram2(String s1, String s2){// ARRAY İLE ÇÖZÜMÜ
		String str1Arr[]= s1.split("");
		Arrays.sort(str1Arr);
		String str2Arr[]= s2.split("");
		Arrays.sort(str2Arr);

		if (Arrays.equals(str1Arr, str2Arr)) {
			return true;
		}else return false;
	}

}
