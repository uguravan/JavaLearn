package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */
    static ArrayList<String> colours = new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
    static String s1 = "blue";
    static String s2 = "yellow";

    public static void main(String[] args) {
        System.out.println(changeInArraylist(colours, s1, s2));
    }

    private static ArrayList<String> changeInArraylist(ArrayList<String>colours, String s1, String s2) {
        for (String i : colours) {
            if (i.equals(s1)) {
                colours.set(colours.indexOf(i), s2);
            }
        }
        return colours;
    }
}
