package UgurJava.j12_Loops.TasksUgur;
import java.util.Scanner;
public class Task10Nested {
    public static void main(String[] args) {
        /*

         */
        Scanner sc=new  Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String str=sc.nextLine().toLowerCase().trim();

        System.out.println("sayılacak harfi giriniz : ");
        char c=sc.next().toLowerCase().trim().charAt(0);
        int flag=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)== c) flag++;
        }
        System.out.print(flag);
    }
}
