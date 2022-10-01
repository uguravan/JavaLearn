package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _30_Scanner8 {
    public static void main(String[] args) {
    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */
        Scanner input= new Scanner(System.in);
        System.out.print("kg cinsinden bir ağırlık yazınız :");
        byte kilo= input.nextByte();
        System.out.println("kilo = " + kilo);
    }
}
