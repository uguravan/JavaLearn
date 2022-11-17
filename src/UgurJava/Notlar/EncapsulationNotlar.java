package UgurJava.Notlar;

public class EncapsulationNotlar {
    /*
    1- Encapsulation kisaca data hiding(saklamak) demektir.
            ​
            2- Basarili bir encapsulation asagidaki özelliklere sahip olmali.
            a)Nasil kullanilacagi belli olmali --> direksiyon gibi.
    b)Kodun karmasikligi kullanimin karmasikligina sebep olmamali yani çok karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmeli.
            c)Bir bölümün bozulmasi baska böümlerin bozulmasina sebep olmamali.

            3-Encapsulation nasil yapilir?
    a)Access modifierler "private" olarak kullaniniz.
    b)getter ve setter methodlari ile "encapsulated" datalara ulasip onlari okuyabilir(getter) ve degistirebiliriz(setter)

            4- Encapsulation nin faydalari
    a)Esneklik (flexibility) Normalde asagida age variablenin degeri 25'tir. Ama diger classlarda setAge() method unu kullanarak age variable nin degerini istedigimiz gibi degistirip kullanabiliriz.
    b)Reusabilitiy(tekrar kullanilabilirlik) getter ve setter methodlari birkez olustururuz sonra proje icindeki classlardan istedigimiz kadar kullanabiliriz.
    c)Istediginiz datayi okunabilir(getter() olusturarak) istediginiz datayi okunamaz(getter() olusturmayiz) hale getirebilirsiniz.
    d)istediginiz datayi degistirilebilir(setter olusturarak), istediginiz datayi degistirilemez yapabilirsiniz...
    e-Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya göstermez. Böylece kullanici yapmak istediklerini daha rahat yapar.

            NOT: tüm variable lar private ve sadece getter methodlar olusturuldugunda bu classtaki veriler sadece okunabilir. Bu tarz class lara "Immutable class" denir.

5- bir classta tüm variable lar private ise ve tüm getter ve setter lar olusturulmus ise bu class "Fully Encapsulated" olarak adlandirilir.
            6- getter() ve setter() methodlarina "Java Beans" de denir.

    NOT: data type boolean oldugunda getter method un ismi "get" ile degil "is" ile baslar.
     */
}
