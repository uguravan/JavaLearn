package UgurJava.j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev07 {

    public static void main(String[] args) {
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        Scanner scan=new Scanner(System.in);
        System.out.print("ağam! kaç satır yazdırmak istiyorsun? ");
        int satır=scan.nextInt();

        for (int i = 1; i <=satır; i++) {
            int fark = satır-1;
            int value = i;
            for (int j = 1; j <=i; j++) {
                System.out.print(value+" ");
                value += fark;
                fark--;
            }
            System.out.println();
        }
        scan.close();
    }
}
