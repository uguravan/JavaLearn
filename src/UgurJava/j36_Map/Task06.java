package UgurJava.j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06 {
    /*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
 */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Lion");
        map.put(2,"Tiger");
        map.put(3,"Elaphant");
        map.put(4,"Cat");
        map.put(5,"Dog");

        Scanner scan = new Scanner(System.in);
        System.out.print("kaç numaralı animalı getirelim? ");
        int num= scan.nextInt();
        System.out.println(map1(map, num));
    }

    private static String map1(Map<Integer, String> map, int num ) {
        return map.get(num);
    }
}
