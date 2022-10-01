package UgurJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double a= input.nextDouble();
        String s = a>0 ? (a>10 ? "Büyüksün" : "Normalsin") : (a<0 ? (a<-10 ? "Çok negatifsin" : "Negatifsin") : "Nötr");
        System.out.println(s);
    }
}
