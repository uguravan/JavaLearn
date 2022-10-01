package UgurJava.j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad="Uğur",soyad="Avan";
        int a=7,b=11;
        // Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa
// java birleştirme yaparak yeni bir String oluşturur
        System.out.println(ad+soyad+a+b);//

        System.out.println(a+ad+soyad+b);//

        System.out.println(a+b+ad+soyad);//

        System.out.println(" "+a+b);//

        System.out.println(ad+soyad+(a+b));//

        System.out.println((a+b)+ad+soyad);//

        System.out.println(ad+(a-b)+(a-b));//
        char ch='1';//
        System.out.println(ad+ch);

        System.out.println(a+ch+ad);

        System.out.println(ad+(ch+b));

        System.out.println(a+ad+ch);
        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
 */
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
// işlem yapılıp String variable'a Concatenation yapılır.
    }
}
