package UgurJava.j35_Collections.C02_Set;

import java.util.HashSet;
import java.util.List;

public class Task04 {
    /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(List.of("banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1= "banana";
        String str2= "peach";
        System.out.println("ilk hali: "+set);

        System.out.println("Setin son hali: "+changeSet(set, str1, str2));
    }
    private static HashSet changeSet(HashSet<String> set, String str1, String str2) {
        if(set.removeIf(x -> x.equals(str1))) set.add(str2); System.out.println(str1+" "+str2+" ile değiştirilmiştir.");
        return set;
    }
}
