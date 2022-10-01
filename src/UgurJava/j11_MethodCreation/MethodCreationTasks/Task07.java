package UgurJava.j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        int c = scanner.nextInt();

        min(a,b,c);
    }

    public static void min(int a,int b,int c) {
    String enkucuk = a<b && a<c ? "en küçük "+a : (b<c && b<a ? "en küçük "+b : (c<a && c<b ? "en küçük "+c : ("girdiğiniz sayılarda birden fazla en küçük değer var. ")));
        System.out.println(enkucuk);
    }

}

