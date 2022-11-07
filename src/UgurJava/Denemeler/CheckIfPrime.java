package UgurJava.Denemeler;

import java.util.Scanner;

/*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */
public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a pozitive number: ");
        int num = scan.nextInt();
        int counter=0;
        for(int i=2 ; i<num ; i++) {
            if(num%i==0){
                counter++;
                break;
            }
        }
        System.out.println((num!=1 && num>0 && counter==0)? num+" is a prime number" : num+" is not a prime number");
        scan.close();
    }
}
