package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    static ArrayList<String> s1= new ArrayList<>(List.of("Orange","Kiwi","Peach","Banana","Banana","Orange"));
    static ArrayList<String> s2= new ArrayList<>(List.of("Orange","Kiwi","Peach","Banana","Banana","Orange"));
    public static void main(String[] args) {
        getCount(s1);
        }

    public static void getCount(ArrayList<String> s1) {
        int counter = 0;
        for (int i = 0; i < s1.size(); i++) {
            counter = 0;
            for (int j = 0; j < s2.size(); ) {
                if (s1.get(i).equals(s2.get(j))) {
                    counter++;
                    s2.remove(j);
                } else j++;
                if (counter>=2){
                    System.out.print(s1.get(i)+" ");
                    System.out.println("Counter: "+counter);
                }
            }
        }
    }
}
