package UgurJava.j10_StringManipulations.tasks2;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Canınızın istediğini yazınız : ");
        String s = input.nextLine();
        if (s.contains(" ")) {
            System.out.println("Yazdığınız metinde \"boşluk\" karekteri mevcuttur.");
        } else System.out.println("Yazdığınız metinde \"boşluk\" karekteri yoktur.");
        input.close();
    }
}

