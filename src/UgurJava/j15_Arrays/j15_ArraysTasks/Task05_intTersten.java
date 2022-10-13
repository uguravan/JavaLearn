package UgurJava.j15_Arrays.j15_ArraysTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task05_intTersten {

    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int a= scan.nextInt();
        String s = String.valueOf(a);
        String  rakamArr[] = s.split("");
        //System.out.println(Arrays.toString(rakamArr));
        for (int i=rakamArr.length-1; i>=0; i--){
            System.out.print(rakamArr[i]);
        }
    }
}
