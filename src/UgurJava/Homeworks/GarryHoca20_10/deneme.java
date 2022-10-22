package UgurJava.Homeworks.GarryHoca20_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Liste icin sayi giriniz.");
        System.out.println("Sayi girisini bitirmek icin 'q' giriniz.");

        int toplam = 0;
        String islem = "";

        while (!islem.equalsIgnoreCase("q")) {
            System.out.println("Sayi giriniz : ");
            islem = scan.nextLine();
            list.add(islem);
        }
        list.remove(list.size()-1);

        for (String i: list){
            int a= Integer.parseInt(i);
            toplam+= a*a;
        }
        System.out.println(list+" elemanlarının kareleri toplamı: "+toplam);
        scan.close();
    }
}