package UgurJava.j01_Variables;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("merhaba dünya");// bu komut konsola yazılan metni print eder
        /*
        bu araya yazılan her şey yorum olarak kabul edilir java tarafından
         */
        /* System.out.println("javacanlara selam olsun");
        System.out.println("javacanlara selam olsun");
        System.out.println("javacanlara selam olsun");
        System.out.println("javacanlara selam olsun");*/

       /*
       TRICK : javada code satırı cümle(statement) sonuna mutlaka  ; koyulmalı
code satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
CTE düzeltimeden code yazılmaz yazılan code çalışmaz
        */
        //System.out.println("hata");//cte compile time error
        System.out.println("Uğur Avan 45 Kırıkkale QA Engineer");
        System.out.println("Uğur Avan");
        System.out.println("Yaş 45");
        System.out.println("Memleket: Kırıkkale");
        System.out.println("QA Engineer olacak inşallah");
        /*
        TRICK:
        print o satıra yazar ama cursor bir alt satıra geçmez, yani bir sonraki komutu aynı satırda devam ettirir.
        print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println-> yazdırma işleminden sonraki komutu ALT satırda devam ettirir.
        javada space "boşluk" bir character olarak tanımlanır
        h a l u k->9 karakter
         */
    }
}
