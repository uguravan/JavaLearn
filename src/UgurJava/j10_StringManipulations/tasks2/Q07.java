package UgurJava.j10_StringManipulations.tasks2;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Üç harfli bir isim giriniz: ");
        String isim = input.nextLine();

        if (isim.length() == 3) {
            char c1 = isim.charAt(0);
            char c2 = isim.charAt(1);
            char c3 = isim.charAt(2);
            String unique = (c1 == c2 || c1 == c3 || c2 == c3) ? "Girdiğiniz isimde aynı olan harfler vardır. " : "Girdiğiniz isimde tüm harfler farklıdır. ";
            System.out.println(unique);
        } else System.out.println("Hatalı giriş yaptınız. Lütfen üç harfli bir isim giriniz. ");
        input.close();
    }
}