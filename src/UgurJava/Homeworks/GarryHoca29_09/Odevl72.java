package UgurJava.Homeworks.GarryHoca29_09;

import java.util.Scanner;

public class Odevl72 {
    /*
        7-      Iki String anagram mi degil mi kontrol ediniz ve method kullanarak yapiniz. | Anagram = Mary ARMY
            (Method Creation kullanın)*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Anagram kontrolü için ilk kelimeyi giriniz: ");
        String s1 = scan.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Anagram kontrolü için ikinci kelimeyi giriniz: ");
        String s2 = scan.nextLine().replaceAll("\\s", "").toLowerCase();

        if (Anagram(s1, s2)) {
            System.out.println(s1+" ve "+s2+" Anagram");
        } else System.out.println(s1+" ve "+s2+" Anagram değil. ");
        scan.close();
    }
    public static boolean Anagram(String s1, String s2) {
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
            } return false;
        }return false;
    }
}