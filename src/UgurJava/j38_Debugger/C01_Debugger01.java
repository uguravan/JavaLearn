package UgurJava.j38_Debugger;

public class C01_Debugger01 {
    /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir..


İki durumda debugger gerekli olabilir:
 *  Mevcut kod devralındığında.
 *  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
 */
    static int num=11;
    public static void main(String[] args) {
        method01();
    }

    private static void method01() {
        System.out.println("method01 çalışıyor.");
        num++;
        int a=0;
        for(int i=1; i<=10; i++) {
            System.out.print(i+" ");
            a+=2*i;
        }
        System.out.println();
        System.out.println("method02 call ediliyor");
        method02();
        System.out.println("method03 call ediliyor");
        method03();
        System.out.println("method01 bitti.");
    }

    private static void method03() {
        System.out.println("method03 çalışıyor.");
        num-=5;
        for(int i=1; i<=5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("method03 bitti");
    }

    private static void method02() {
        System.out.println("method02 çalışıyor.");
        num+=3;
        for(int i=1; i<=7; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("method02 bitti");
    }
}
