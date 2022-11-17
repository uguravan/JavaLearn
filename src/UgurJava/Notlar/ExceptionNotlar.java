package UgurJava.Notlar;

public class ExceptionNotlar {
    /*
    --------->	EXCEPTIONS  <---------
    Iki tür exceptions vardir.

            1) Compile Time (checked) Exceptions: Kod creat edilirken JAVA'nin öngördügü olasi sorunlara karsi hatanin altini cizilmesi. Ama her alti kirmizi cizilen kod exception degildir.

            2) Run Time (unchecked) Exceptions: Kod run edildiginde olusan exceptions'dur.

            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            1) Kod creat edilirken Exception kullanilmasi gerekirse:

    a) ---> Add throws declarations: Hata olustugunda Console'e hata ile ilgili mesaj verir.
    b) ---> Try-Catch block: Hata olustugunda hata'nin yazdirilmasi ve handle(fix) edilmesini saglar.

            2) Try block'tan sonra en az bir tane catch block olmali aksi durumda CTE verir.
            3) Try-Catch block'ta try body hatasiz calisirsa catch body calistirilmaz. Catch body try body'deki exceptions'da calisir.
            4) Try body'den sonra birden fazla catch body creat edilebilir. Olusan exceptions hangi catch ile ilgiliyse o catch body calisir. Ayni anda sadece tek catch body calisir.
            5) Tek try ama birden cok catch body olan durumlarda catch bodyler arasinda yukaridan asagiya dogru child - parent iliskisi olmalidir. Aksi takdirde CTE verir.(Erisilemez catch blogu)
    Catch bodyler arasinda parent-child iliskisi yoksa siralama önemli degildir. Yukaridan asagiya catchler calisir.
     */
}
