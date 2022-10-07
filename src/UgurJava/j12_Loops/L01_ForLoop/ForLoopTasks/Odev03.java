package UgurJava.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int num = scan.nextInt();

        System.out.println(getAsalMi(num) ? "girdiğiniz sayı ASAL " : "girdiğiniz sayı ASAL değil.");
        scan.close();
    }
    public static boolean getAsalMi(int num) {
        boolean flag=true;

        for (int i=2; i<num; i++) {
            if (num%i ==0) flag = false;
        }
        return flag;
    }
}
