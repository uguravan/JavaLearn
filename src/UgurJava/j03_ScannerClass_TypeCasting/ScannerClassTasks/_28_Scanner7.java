package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class _28_Scanner7 {
    public static void main(String[] args) {
        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner input= new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var mı ? varsa true yoksa false giriniz. ");
        boolean account=input.nextBoolean();
        System.out.println("account = " + account);
    }
}
