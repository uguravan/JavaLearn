package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca8HaftaSonuUgur {
    /*
    // Soru) Kullanicidan gün ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
    // Ornek: gün=Pazar output = "Hafta sonu" - gün=Sali output = "Hafta ici"
    // String icin equals method'unu kullanin.
    BU SORUDA FLAG KULLANMANIZI ISTIYORUM. BILMIYORSANIZ INTERNETTEN BAKIN :)*/
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        boolean flag = false;
        System.out.println("gün ismini giriniz : ");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            flag = true;
            }
        if (flag) {
            System.out.println("Hafta sonu");
        } else System.out.println("Hafta içi");
    }
}

