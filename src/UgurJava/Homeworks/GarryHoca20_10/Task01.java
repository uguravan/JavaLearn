package UgurJava.Homeworks.GarryHoca20_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {
    //Girilen String'i ArrayList kullanarak ters ceviriniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz. ");
        String metin= scan.nextLine();

        ArrayList<String> list= new ArrayList<String>();
        for (int i=0; i<metin.length(); i++) {
            list.add(""+metin.charAt(i));
        }
        for (int i =list.size()-1; i>=0; i--) {
            System.out.print(list.get(i));
        }
        scan.close();
    }
}
