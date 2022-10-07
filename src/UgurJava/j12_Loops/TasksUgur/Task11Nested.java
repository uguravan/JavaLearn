package UgurJava.j12_Loops.TasksUgur;
import java.util.Scanner;

public class Task11Nested {
    public static void main(String[] args) {
/*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    şeklini yazdırınız.  65=A'nın ascıı değeri
    */
        Scanner sc=new  Scanner(System.in);
        System.out.println("ağam hangi BÜYÜK harfe kadar yazdıralım : ");
        int c=sc.next().trim().charAt(0);

        for (int i = 0; i <(c-64) ; i++) {
            for (int j = 0; j <=i ;j++) {
                System.out.print((char)(65+j));
            }System.out.println();
        }
    }
}
