package UgurJava.j12_Loops.Tasks;

public class TaskFibonacci {
    static int a=1, b=1;
    public static void main(String[] args) {
        System.out.print("1 ");
        System.out.print("1 ");
        fibo(a,b);
    }
    public static void fibo(int a,int b) {
        int c= a+b;
        if (c<500) {
        a=b;
        b=c;
        System.out.print(b+" ");
            fibo(a,b);
        }
    }
}
