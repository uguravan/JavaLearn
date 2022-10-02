package UgurJava.j11_MethodCreation.MethodCreationTasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner input = new Scanner(System.in);
        System.out.print("yılı giriniz : ");
        int year = input.nextInt();
        System.out.print(artıkyıl(year));
        input.close();
    }
    public static boolean artıkyıl(int year) {
        boolean artyear = year % 4 == 0 ? (year % 400 == 0 ? true : (year % 100 == 0 ? false : true)) : false;
        return artyear;
    }
}
