package UgurJava.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int num = scan.nextInt();

        System.out.println(powerOfThree(num) ? "girdiğiniz sayı 3'ün üssü " : "girdiğiniz sayı 3'ün üssü değil.");
        String u = (ucunUssu(num) ? "girdiğiniz sayı 3'ün üssü " : "girdiğiniz sayı 3'ün üssü değil.");
        System.out.println(u);
        scan.close();
    }
    public static boolean powerOfThree(int num) {
        boolean flag=true;

        for (int i=3; i<=num; i*=3) {
            if (num%i !=0) flag = false;
        }
        return flag;
    }
    public static boolean ucunUssu (int a) {
        boolean power = false;
        while (a >3) {
            a /= 3;
        }
        if (a%3 == 0) power = true;
        return power;
    }
}
