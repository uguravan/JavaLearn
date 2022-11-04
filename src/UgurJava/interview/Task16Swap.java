package UgurJava.interview;

public class Task16Swap {
    /*
16 -->> Swap two variable values without using a third variable
*/
    public static void main(String[] args) {
        int a=23;
        int b=223;
        System.out.println("a= "+a+" b= "+b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swap -> a= "+a+" b= "+b);
    }
}
