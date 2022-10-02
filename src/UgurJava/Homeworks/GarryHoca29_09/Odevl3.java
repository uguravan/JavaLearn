package UgurJava.Homeworks.GarryHoca29_09;

import java.util.Scanner;

public class Odevl3 {
    /*
        3-       * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.

         * input : ali
         * output: girdiginiz kelime 3 harfli ve unique karaktere sahip
         *
         * input : ece
         * output: girdiginiz kelime 3 harfli ve unique karaktere sahip degil*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("3 harfli bir ism giriniz: ");
        String name = scan.next().trim();
        char c1= name.charAt(0);
        char c2= name.charAt(1);
        char c3= name.charAt(2);

        System.out.println(name.length() == 3 ? ((c1 == c2 || c1==c3 || c2==c3) ? "girdiginiz kelime 3 harfli ve unique karaktere sahip degil" : "girdiginiz kelime 3 harfli ve unique karaktere sahip" ):"girdiğiniz isim 3 harfli değil");
        scan.close();
    }
}
