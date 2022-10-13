package UgurJava.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    //Task-> kullanıcdan alınan değerlerle bir int array elemanlarını bukukten kucuge   print eden code create ediniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ağam kaç elemanlı bir array istersin?");
        int boyut=scan.nextInt();
        int num[] = new int[boyut];
        for (int i = 0; i <boyut ; i++) {
            System.out.print("bir sayı giriniz: ");
            num[i] = scan.nextInt();
        }
        System.out.println();
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int tersten[]= new int[boyut];
        for (int i =0 ; i <boyut; i++){
            tersten[i] = num[boyut-1-i];
        }
        System.out.println(Arrays.toString(tersten));
        int sum=0;
        for (int i = 0; i <boyut ; i++) {
            sum += num[i];
        }
        System.out.print(sum);
    }
}
/*package j15_Arrays;
        ​
        import java.util.Arrays;
        import java.util.Scanner;
        ​
public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.

        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println("array eleman toplamları : "+arrToplam);
    }
}
*/