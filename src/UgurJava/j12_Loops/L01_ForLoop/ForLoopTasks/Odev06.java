package UgurJava.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev06 {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("çakma GAUSS hizmetinizde! 1'den kaça kadar ardışık toplayayım? ");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <=num ; i++) {
            sum += i;
        }
        System.out.println(sum);
        scan.close();
    }
}
