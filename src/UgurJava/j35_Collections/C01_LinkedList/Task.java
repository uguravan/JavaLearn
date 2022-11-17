package UgurJava.j35_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task {
    /*
Task->
Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bşe linkedLst create ediniz.
Girilen bir String değeri linkedListte varlığını kmontrol edip varss slilp "Agam elelman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("yakup", "javaCAN", "javaTAR", "Teykinay"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Agam kime bakmıştınız : ");
        String aganınAdamı = sc.next();

        System.out.println(ll1);

        if (ll1.remove(aganınAdamı)) {//true->sitenen node var ve silindi

            System.out.println("Agam eleman halledildi");
            System.out.println("aganın adamı halloduktan sonra :" + ll1);

        } else System.out.println("Agam aradığınız kişiye ulaşılamadı");
        sc.close();
    }
}
