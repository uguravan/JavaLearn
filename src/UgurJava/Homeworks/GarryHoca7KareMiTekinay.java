package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca7KareMiTekinay {
    /*
            // Soru 1) Kullanicidan dikdörtgen kenar uzunluklarini isteyin ve dikdörtgen kare olup olmadigini yazdirin.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("dikdörtgenin kısa kenarını giriniz : ");
        double d1 = scan.nextDouble();
        System.out.println("dikdörtgenin uzun kenarını giriniz");
        double d2 = scan.nextDouble();

        if (d1 == d2) {
            System.out.println(" Kare ");
            }else System.out.println(" Kare değil Dikdörtgen ");
    }
}
/*
    // Soru) Kullanicidan gün ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
    // Ornek: gün=Pazar output = "Hafta sonu" - gün=Sali output = "Hafta ici"
    // String icin equals method'unu kullanin.
    BU SORUDA FLAG KULLANMANIZI ISTIYORUM. BILMIYORSANIZ INTERNETTEN BAKIN :)*/

