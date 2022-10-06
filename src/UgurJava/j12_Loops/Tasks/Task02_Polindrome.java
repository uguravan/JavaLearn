package UgurJava.j12_Loops.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz: ");
        String metin =scan.nextLine().trim();

        reverse(metin);
    }
    public static void reverse(String metin) {
        String tersMetin="";
        for(int i = metin.length()-1 ; i >=0 ; i--) {
            tersMetin += metin.charAt(i);
        }
        if (metin.equalsIgnoreCase(tersMetin)) {
            System.out.println("polindrome");
        }else System.out.println("polindrome değil");
    }
}
