package UgurJava.j12_Loops.TasksUgur;

import java.util.Scanner;

public class TaskFibonacci {
    static int a=1, b=1, last=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("AĞAM hangi tamsayıya kadar FIBONACCI dizisini oluşturalım? ");
        last =scan.nextInt();
        System.out.print("1 ");
        System.out.print("1 ");
        fibo(a,b);
    }
    public static void fibo(int a,int b) {
        int c= a+b;
        if (c<last) {
        a=b;
        b=c;
        System.out.print(b+" ");
            fibo(a,b);
        }
    }
}
