package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11_SıfırGir {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
    Scanner scan = new Scanner(System.in);
    int sum=0;
    int girilensayi=1;
    int sayac=0;

    while (girilensayi!=0){
        System.out.print("bir tamsayı giriniz: ");
        girilensayi=scan.nextInt();
        sum+=girilensayi;
        sayac++;
    }
        System.out.println("0 (sıfır) girilene kadar girilen tum sayıların adedi : "+sayac+"\nToplam : "+sum);
    }
}
