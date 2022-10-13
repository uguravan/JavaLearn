package UgurJava.j13_Break_Continue.HaftanınTaskiii.HaftanınTaskiii;

import java.util.Scanner;

public class T02_IkininKuvveti {
    static int power=0;
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("bir tamsayı giriniz: ");
        int num=scan.nextInt();

        powerOfTwo(num);
    }
    public static void powerOfTwo(int num) {
        while (num>=2){
            if (num%2==0){
                num /=2;
                power++;
            }else break;
        }
        System.out.println(num==1 ? "ikinin "+power+". kuvveti " : "ikini kuvveti değil. ");
    }
}

