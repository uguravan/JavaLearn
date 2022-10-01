package UgurJava.j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz. ");
        double num1 = scanner.nextDouble();
        System.out.println("2.sayıyı giriniz. ");
        double num2 = scanner.nextDouble();
        System.out.println("yaptırmak istediğiniz işlemin işaretini giriniz. ");
        char islem = scanner.next().trim().charAt(0);

        switch (islem) {
            case '+': topla(num1, num2); break;
            case '-': çıkarma(num1, num2); break;
            case '*': çarpma(num1, num2); break;
            case '/': bölme(num1, num2); break;
            default: System.out.println("Hatalı Giriş"); break;
        }
    }
    public static void topla(double num1, double num2) {
        System.out.println(num1+num2);
    }
    public static void çıkarma(double num1, double num2){
        System.out.println(num1-num2);
    }
    public static void çarpma(double num1, double num2) {
        System.out.println(num1*num2);
    }
    public static void bölme(double num1, double num2) {
        System.out.println(num1/num2);
    }

}
