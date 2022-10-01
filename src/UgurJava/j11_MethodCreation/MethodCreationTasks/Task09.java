package UgurJava.j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("saat giriniz: ");
        int saat = scanner.nextInt();
        howManySeconds(saat);
    }

    public static void howManySeconds(int s) {
        System.out.println(s*3600);
    }
}
