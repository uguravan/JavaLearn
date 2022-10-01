package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner input= new Scanner(System.in);
        System.out.print("boyunuzu kaç cm : ");
        double boy= input.nextInt();

        System.out.print("kg cinsinden ağırlığınızı yazınız : ");
        double kilo= input.nextInt();

        double vki1= (int) (kilo/((boy*boy)/10000));
        double vki2= kilo/((boy*boy)/10000);
        System.out.println("Vucut kutle endeksiniz : " + vki1+"\nVucut kutle endeksiniz : " + vki2);
    }
}
