package UgurJava.Homeworks.GarryHoca29_09;

import java.util.Scanner;

public class Odevl7 {
    /*
        7-      Iki String anagram mi degil mi kontrol ediniz ve method kullanarak yapiniz. | Anagram = Mary ARMY
            (Method Creation kullanın)*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Anagram kontrolü için ilk kelimeyi giriniz: ");
        String s1 = scan.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.println("Anagram kontrolü için ikinci kelimeyi giriniz: ");
        String s2 = scan.nextLine().replaceAll("\\s", "").toLowerCase();

        int flag = s1.length();

        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.indexOf(s1.charAt(i)) >= 0) {
                        s1 = s1.substring(i + 1);
                        if (s2.indexOf(s1.charAt(i)) != s2.length() - 1) {
                            String s21 = s2.substring(0, s2.indexOf(s1.charAt(i)));
                            String s22 = s2.substring(s2.indexOf(s1.charAt(i)) + 1);
                            s2 = s21.concat(s22);
                        } else s2 = s2.substring(0, s2.indexOf(s1.charAt(i)));
                        flag--;
                    }
                }
            }
        }
        System.out.println(flag == 0 ? "Anagram" : "Anagram değil.");
    }
}