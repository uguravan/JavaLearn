package UgurJava.Homeworks;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
    /*
    // Soru) Kullanicidan gün ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
    // Ornek: gün=Pazar output = "Hafta sonu" - gün=Sali output = "Hafta ici"
    // String icin equals method'unu kullanin.
    BU SORUDA FLAG KULLANMANIZI ISTIYORUM. BILMIYORSANIZ INTERNETTEN BAKIN :)*/
        Scanner scanner = new Scanner (System.in);
        int flag = 0;
        System.out.print("gün ismini giriniz :");
        String gun = scanner.nextLine().toLowerCase();

        if (gun.equals("cumartesi") || gun.equals("pazar")){
            System.out.println("Hafta sonu");
            flag++;
        }
        if (gun.equals("pazartesi") || gun.equals("salı")) {
            System.out.println("Hafta içi");
            flag++;
        }
        if (flag == 0) {
            System.out.println("Hatalı giriş yaptınız. ");
        }
    }
}
