package UgurJava.j10_StringManipulations.tasks2;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz ");
        String str = scanner.next();
        str.replace(str.substring(str.length() - 1),"");
        System.out.println(str.substring(0, str.length() - 1));
    }
}
