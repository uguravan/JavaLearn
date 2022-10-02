package UgurJava.j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz
    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("email adresi giriniz : ");
        String email = scanner.nextLine().trim();

        System.out.println(ePosta(email));
        scanner.close();
    }
    public static boolean ePosta(String email) {
        boolean flag = false;
        if (email.contains("@") && email.indexOf("@") == email.lastIndexOf("@")){
            if (email.contains(".") && email.indexOf(".") == email.lastIndexOf(".")){
                if (email.indexOf("@") > 0){
                    flag = true;
                }
            }
        }
        return flag;
    }
}