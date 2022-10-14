package UgurJava.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSalyangoz {
    /* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
        input :3
        output:
                1       2       3
                8       9       4
                7       6       5

         input :4
         output :
                1       2       3       4
                12      13      14      5
                11      16      15      6
                10      9       8       7
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Salyangoz matrisin boyutu kaç olsun AĞAM: ");
        int boyut= scan.nextInt();
        int max= boyut;
        int matris[][]= new int[boyut][boyut];

        int satır=0;
        int sütun=-1;
        int value=1;
        int geçiş=1;

        for(int i=0; i<boyut; i++) { //Salyangoz Arrayi oluşturuyoruz.
            for(int j=0; j<max; j++) {
                sütun+= geçiş;
                matris[satır][sütun]= value++;
            }
            max--;
            for(int j=0; j<max; j++) {
                satır+= geçiş;
                matris[satır][sütun]= value++;
            }
            geçiş*=-1;
        }
        for (int i=0; i<boyut; i++) {//Salyangoz Arrayimizi yazdırıyoruz.
            for (int j=0; j<boyut; j++) {
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
