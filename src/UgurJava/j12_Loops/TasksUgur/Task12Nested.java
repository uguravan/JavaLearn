package UgurJava.j12_Loops.TasksUgur;
import java.util.Scanner;

public class Task12Nested {
    public static void main(String[] args) {
/*
    Girilen 5 sayının toplamı 10 ile 20 arasındakiler hariç
    */
        Scanner sc=new  Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i+". sayıyı giriniz");
            int a=sc.nextInt();
            if (a<10||a>20) sum+=a;
            }System.out.println("toplam = "+sum);
        }
    }

