package UgurJava.j35_Collections.C02_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task03Benim {
    /*
commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
return tipi arraylist olmalı.
ÖRNEĞİN:
İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
Ortak değerleri ArrayListe ekleyiniz.
çıktı:  "Germany" , "Brazil" ,"USA"
ArrayListi yazdırınız.
 */
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>(List.of("Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> hs2 = new HashSet<>(List.of("Germany" , "China" , "Brazil" , "France" ,  "USA"));

        System.out.println(commonValues(hs1, hs2));
    }
    public static List commonValues(HashSet hs1, HashSet hs2) {
        hs1.retainAll(hs2);
        List<String> result = new ArrayList<>(hs1);
        return result;
    }
}
