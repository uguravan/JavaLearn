package UgurJava.j15_Arrays.j15_ArraysTasks;

import java.util.Scanner;

public class Task08_7elemanlı {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        int num[] = new int[7];
        for (int i = 0; i <7 ; i++) {
            System.out.print("bir sayı giriniz: ");
            num[i] = scan.nextInt();
        }
        for (int i = 0; i <7 ; i++) {
            if (num[i]%2==1) {
                System.out.print(num[i]+" ");
            }
        }
    }
}
