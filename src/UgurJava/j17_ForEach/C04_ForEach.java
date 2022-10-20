package UgurJava.j17_ForEach;

import java.util.ArrayList;

public class C04_ForEach {
    public static void main(String[] args) {
// task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};
        ArrayList<String> isimler= new ArrayList<>();
        for(String i: arr1){
            for(String j: arr2){
                if(i.equalsIgnoreCase(j)){
                    System.out.print(i+" ");
                }
            }
        }

        for(String i: arr1){
            for(String j: arr2) {
                if (j.contains(i)) {
                    isimler.add(i);
                }
            }
        }
        System.out.println(isimler);
    }
}
