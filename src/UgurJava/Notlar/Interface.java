package UgurJava.Notlar;

public class Interface {
    /*
    1) "Interface" asla bir class degildir.

            2) Interface yapilarda concrete method asla olusturulamaz. Sadece abstract method'lar olusturulur. (JAVA 8'e kadar gecerlidir.)

            3) JAVA multiple Inheritance desteklemez. Ancak Interface parent'ler multiple Inheritance'yi destekler.

            4) Birden fazla parent class'larda ayni isimli method'larin olmasi durumunda child class ayni isimli farkli bodyli method'lar icin secim yapamaz.
    Fakat Interface'lerde method'larin bodyleri olmadigindan ayni isimli methodlar birbiriyle tamamen ayni oldugu icin secim tercihi söz konusu olamaz.
    Child class parent Interface'den ayni isimli method'lardan birini Override ederek bu sorun cözülür.

5) Parent Interface'lerde ayni isimli fakat farkli return type'li methodlar child class'ta CTE verir.

            6) Interface yapilarda tüm method'lar abstract olmak zorunda oldugundan method signature "abstract" keyword yazilmayabilir.

    public abstract void koltuk(); // Abstract Method --> Abstract keyword kullanilmis.
    public void ayna(); // Abstract Method. --> Abstract keyword kullanilmamis.

7) Interface'lerdeki tüm member'lar public olacagi icin AccesModifier yazilmasa da public ile ayni islemi yapar.

    public void ayna();  <--->  abstract void koltuk();  --> ayni islemi yapar.

   !!! Normal class'larda AccesModifier yazilmazsa default olur. Ancak Interface'lerde AccesModifier yazilmazsa public olur.

8) Interface'ler kendi arasinda parent child(extends) iliskisi kurabilir.
    Interface'leri bir class'a parent yapmak icin "implement" keyword'u kullanilir.
    Class'lari bir class'a parent yapmak icin "extends" keyword'u kullanilir.

    Class --> Class : extends
    Interface --> Interface : extends
    Class --> Interface : implements
    Interface --> Class : OLAMAZ. --> Interface'nin parant'i class olamaz.

            9) Interface'lerde variable'lar mutlaka final'dir.

    a) Final variable'ler italic & bold'dur ve büyük harf ile yazilmalidir.
    b) Final variable'ler initialize edilmezse CTE verir.

            10) *** Interface'lerde variable'lar mutlaka static'dir. Dolayisiyla obje olusturmadan interface ismi ile ulasilabilir.

            11) Interface'lerde tüm member'lar public'tir. Dolayisiyla tüm Interface variable'lari --> public + static + final (yazsan da yazmasan da).

            12) Interface yapilarda istenirse abstract olmayan concrete method olusturulabilir.

    a) AccesModifier'dan sonra "default" veya "static" keyword kullanilmalidir.
    b) Interface yapilarda concrete method icin kullanilan "default" keyword'u kesinlikle AccesModifier türünü vermez.
    c) Interface yapilarda concrete method child class tarafindan override edilmek zorunda degildir.
    d) Interface yapilarda default olarak olusturulan concrete method child class'a ancak obje ile call edilir.
    e) Interface yapilarda static olarak olusturulan concrete method child class'a ancak DataType(Interface name) ile call edilir.
     */
}
