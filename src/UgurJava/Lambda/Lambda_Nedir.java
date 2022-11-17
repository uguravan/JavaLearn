package UgurJava.Lambda;

public class Lambda_Nedir {
    /*
    Lambda (Functional Programming)                                                                           JAVA (Structured Programming)

1) Nasil yaparim degil, ne yaparim sorulur.                                                               1) Ne yaparimdan cok nasil yaparim düsünülür.
2) Kod kisaligi, kod okunabilirligi ve hatasiz kod yazma bakimindan elverislidir.                         2) Kod genelde uzundur. Baskasi sizin ne yaptiginizi anlayamayabilir.
3) Lambda sadece Collection'larda ve Array'lerde kullanilir. MAP'lerde kullanilmaz.



- JAVA'da Lambda fonksiyonlari (metodlari) sadece Fonksiyonel Interface'ler (Lambda'da bulunan metodlar --> filter, reduce  ... gibi)

- Kullanci isterse kendi fonksiyonel Interface'sini (method'unu) yazabilir => Mesela bir cift sayi belirleme method'u olusturup Lambda'da onu kullanabiliriz.

- API: Uygulama programlama arayüzü (Ingilizce: Application Programming Interface, kisaca API) bir yazilimin baska bir yazilimda tanimlanmis islevlerini, kullanabilmesi icin olusturulmus bir tanim bütünüdür.

- API, yazilim bileseniyle olan etkilesimlerin bir özelligidir.
  Bu da örnek olarak su anlama gelir. Bir arabanin bir yazilimi oldugunu hayal edin. Bu arabanin API'si arabanin neler yapabilecegi hakkinda bilgi icerir; hizlanma, frenleme, camlari acma, vs...
  Ayrica bunlarin nasil yapabilecegine dair bilgiler de icerir.
  Örnegin hizlanmak icin ayaginizi gaz pedalina koyup itersiniz. API, ayaginizi gaza bastiginizda motorun icinde neler oldugunu aciklamak zorunda degildir.
  Bu nedenle, icten yanmali motorlu bir araba kullanmayi ögrendiyseniz, tamamen yeni bir dizi beceri ögrenmek zorunda kalmadan API sayesinde elektrikli bir arabayi rahatlikla kullanabilirsiniz.

- foreEach(), map(), filter(), reduce() gibi HOF'lar(higher-order function) fonksiyonel interfaceler ile çalistigi için icerisinde Lambda fonksiyonlari yazmak mümkündür.
  Mesela Google'nin görünen yüzü var, birde arkada bilgilerin oldugu bir yer var.
  Google, kullanici ile bilgiler arasinda bir arayüz. Lambda bizim icin bir arayüz, kütüphanesinde methodlar var. JAVA'da genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullaniyoruz.

- forEach ==> Stream içindeki tek tek tüketmek için olusturulmus bir yapidir. Stream islemi artik tüketilmis olarak kabul edilir ve sonrasinda birsey yazilamaz.

- filter ==> Dizimiz veya collection'imiz üzerinde bizim belirtecegimiz kosullar dogrultusunda filtreleme islemi yapar. Bu islem sonrasinda belirttigimiz kosula uygun olmayan elemanlar bir sonraki asamada kullanilmaz.
  filter(t-> t%2==0 && t<15) ==> Elemanlar icinde filtreleme yapar. Ornegin çift ve 15'ten kücük sayilar.

- map() ==> Method'u Collection üzerinde bir transformation islemi saglayan ara islem method'udur. Eger bir Collection'in verilerininin degisik hallerini hesaplamak istersek map() kullanabiliriz.
  Ornegin elemanlarin karesini almak ... map(t-> t*t)(4 elemanini => 16 yapar)
  map ile Math class'indaki method'lari kullanabiliriz... map(Math::sqrt) ==> Burada elemanlarin karesini aliriz.
  map(String::toUpperCase) ==> String class'indan method çagirabiliriz... List'imizin Data Type'inin class'indaki method'lari kullanabiliriz.

- Method Reference'da bizim olusturdugumuz method'lari veya JAVA method'larini kullaniriz.
  Method Reference Syntax ==> ClassName : : methodName seklinde yazdirabiliriz.
  Math class'indan method'lari kullanirken Math::addExact gibi multiplyExact gibi method'lari kullanabiliriz.(reduce icinde kullanilabilir)

- limit(a) ==> Ilk "a" kadar elemani verir.

- skip(a) ==> Ilk "a" elemani pas gec digerlerini yazdirir.

- reduce(Integer::min) ==> Integer class'indan method çagirabiliriz. (Ornegin min sayi bulma method'u)

- reduce(Math::max) ==> (Ornegin list'in max elemani istenirse kullanilir ve Math class'indan method çagirabiliriz.)

- distinct() ==> Tekrarli elemanlari siler.

- sorted () ==> Natural order'a göre siralama yapar.

- sorted(Comparator.reverseOrder()) ==> Büyükten kücüge siralamak istersek, Comparator class'indan reverseOrder() method'unu kullaniriz.

- allMatch(): Bütün elemanlarda olmasini istedigimiz seyleri yazariz sonuç boolean verir.
 			  Ornegin String bir List icin ==> allMatch(t -> t.length() < 7) == elemanlarin hepsinin uzunlugu 7'den kücükse true, biri bile degilse false verir.

- noneMatch(): Hicbir elemanda olmasin istersek kullaniriz. Elemanlarin tümünde yoksa true, bir tane elemanda bile varsa false verir.
			   Ornegin ==> noneMatch(t-> t.startsWith("X")) == Hicbiri X ile baslamiyorsa true.

- anyMatch(): En az bir elemanda olmasini istedigimiz bir özellik varsa kullaniriz, sonuc boolean verir.
              Ornegin ==> anyMatch(t-> t.endsWith("R")) == En az bir eleman R ile bitiyorsa true, yoksa false verir.

- findFirst(): Listedeki ilk elemani verir.(Tek eleman verecegi icin, forEach ile yazdirilmaz. Bütün soru syso'nun icine alinarak yazdirilabilir.

- mapToInt yada mapToDouble yapinca toplama icin direkt sum() method'unu kullanabiliyoruz, reduce'ye gidip Integer class'tan sum(), average(), max(), min() method'larini  çagirmaya gerek kalmiyor.

- contains() : Kapsiyor mu? sorusuna boolean yanit verir.  - count(): Istenen elemanin sayisini bulur.
  Ornegin:list.stream().contains("Day")).count(); ==> List'teki Day iceren elemanlarin sayisini verir.

- iterate(): Baslangic degeri ve artis miktari belli olan sorularda kullanilir.
  Mesela ==> iterate(5, t->t+3) === 5'ten basla 3'er 3'er devam et.


- Daha önceden yazdigimiz bir files'i (dosyayi) okuyup, Console'a yazdirmak icin; ---> Files.lines(Paths.get("src/Lambda/FileForLambda")).forEach(System.out::println);
  Files'deki metinin icindeki kelimelerle tek tek islem yapmak istedigimizde; mesela FileForLambda isimli dosyadaki tüm farkli kelimeleri bir List'in icinde ekrana yazdiriniz.
  System.out.println(Files.lines(Paths.get("src/Lambda/FileForLambda")).map(t->t.split(" ")).flatMap(Arrays::stream) --> Bosluklardan virgülle ayirip Array yapti, sonra Array'leri selale gibi yazdirdi.
  distinct().collect(Collectors.toList()));   Harf harf incelemek istersek split("")
  Bazi noktalama isaretlerini su sekilde silebiliriz ==> map(t->t.replaceAll("^[a-zA-Z]", ""): harflerin disindakiler ya da map(t->t.replaceAll("\\W", "")   \\W : Harf ve rakam disindakiler.
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
     */
}
