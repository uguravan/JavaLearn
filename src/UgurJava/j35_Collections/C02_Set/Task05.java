package UgurJava.j35_Collections.C02_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Task05 {
    /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(List.of("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        String str1= "Germany";
        String str2 = "USA";
        System.out.println("Setin ilk hali: "+lhs);

        System.out.println("Setin son hali: "+removing(lhs, str1, str2));
    }
    private static LinkedHashSet removing(LinkedHashSet<String> set, String str1, String str2) {
        set.removeIf(x -> x.equals(str1) || x.equals(str2));
        return set;
    }
}
