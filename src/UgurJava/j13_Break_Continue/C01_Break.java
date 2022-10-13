package UgurJava.j13_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    /*
break oradan sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

// Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.print("mail adresinizi giriniz: ");
    String mail = scan.nextLine();
    char c;
    for (int i = 0; i < mail.length(); i++) {
        c=mail.charAt(i);
        if (c == '@') break;
        System.out.print(c);
    }
}
}
