package UgurJava.Homeworks.GarryHoca29_09;

import java.util.Scanner;

public class Odevl4 {
    /*
        4- 		 * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa
		 * son iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin

                 * ornek input = Ali output = lilili
		 *
                 * input = el output = el
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime giriniz: ");
        String kelime = scan.next().trim();

        if (kelime.length() >= 3) {
            System.out.println(kelime.substring(kelime.length()-2).repeat(3));
        } else System.out.println(kelime);
        scan.close();
    }
}
