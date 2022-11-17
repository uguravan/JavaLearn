package UgurJava.Notlar;

public class AbstrackNotlar {
    /*
    Abstract Classes

        1) Parent class'daki body'siz methodlara abstract method'lar denir.
    Bazi child-parent iliskisindeki class'larda child class, parent class'in bazi methodlarini kullanmak zorunda ise o methodlar abstract hale getirilir.
    ABSTRACT CLASS'LARDA OBJE ASLA OLUSTURULAMAZ.

            2) Bir method abstract yapmak icin --> {body} silinir ve return type'dan önce "abstract" keyword kullanilir.

            3) Abstract bir method ancak abstract bir class'da olusturulur. Concrete class'da asla abstract method creat edilmez.

        4) Abstract bir class'da hem abstract hemde concrete method olabilir.

            5) Concrete class abstract class'a extend edildiginde abstract class'taki tüm abstract method'lari implement(uyarlama) zorundadir. Ama concrete methodlari implement etmeyebilir.

            6) Bir Abstract Class baska bir Abstract Class'a extend edildiginde herhangi bir method'u "Override" etmek zorunda degildir.
    Cünkü JAVA'ya göre abstract child class'inda altinda mutlaka concrete bir child class vardir.

            7) Final, private ve static method'lar abstract olamaz.

            8) Abstract Class'ta concrete variable olabilir. Ama bu variable asla abstract olamaz.
     */
}
