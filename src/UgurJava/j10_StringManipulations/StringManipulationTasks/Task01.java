package UgurJava.j10_StringManipulations.StringManipulationTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true

        if (text.contains(" ")) {
            System.out.println("boşluk karakteri var.");
        }else System.out.println("boşluk karakteri yok. ");
    }
}

