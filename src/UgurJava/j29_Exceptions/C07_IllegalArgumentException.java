package UgurJava.j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    /*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */
    public static void main(String[] args) {
        // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
        // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..

        Scanner sc = new Scanner(System.in);
        System.out.print(" agam yasını giresen : ");

        int age = sc.nextInt();

        // if (age<18){
        //     System.out.println("yasınız : "+age+" ehliyet için uygun değil ");
        //     throw new IllegalArgumentException();//throw komutu try-catch block olmadan da istenen method body'de tanımlanabilir.
        // }
        // else System.out.println("yasınız : "+age+" ehliyet için uygun");

        try {
            if (age < 18) {
                throw new IllegalArgumentException();//throw keyword ile Excp obj olusturularak hata tanımlanır ve fırlatırlır
                // böylece sartımıza uymayan  değer için de catch block'a düşürerek daha pratik code yazıldı
                //  System.out.println("ehliyete basvurman için daha  : " + (18 - age) + "yıl var ...");
            } else System.out.println("agam ehliyete başvurabilirsin hayırlı lsun  " + age);
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (IllegalArgumentException e) {
            System.out.println("agam nidddin bu yaşda ehliyet mi alınır  !!!");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}
