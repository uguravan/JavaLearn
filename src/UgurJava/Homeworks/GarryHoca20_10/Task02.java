package UgurJava.Homeworks.GarryHoca20_10;

import java.util.Scanner;

public class Task02 {
    //Kullanıcıdan sayı isteyin. Alınan sayının asal sayı olup olmadığını yazdırın.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Asal kontrolü için bir sayı giriniz: ");
        int check= scan.nextInt();

        int counter=0;
        for (int i=2; i<=check; i++) {
            if(check%i== 0){
                counter++;
            }
            if(counter>1){
                System.out.println("girdiğiniz sayı "+check+" asal değil");
                break;
            }
        }
        if(counter==1){
            System.out.println("girdiğiniz sayı "+check+" asal bir sayıdır. ");
        }
        scan.close();
    }
}
