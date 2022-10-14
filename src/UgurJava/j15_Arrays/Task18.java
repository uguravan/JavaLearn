package UgurJava.j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{19,-8},{24,0,-41}};
        int max=0;

        int yeniArr[]= new int[sayi.length];
        for (int satır=0; satır<sayi.length; satır++){
            int satırtoplam=0;
            for (int sütun=0; sütun<sayi[satır].length; sütun++){
                satırtoplam+=sayi[satır][sütun];
                }
            yeniArr[satır]=satırtoplam;
            }
        System.out.println(Arrays.toString(yeniArr));
        }

    }
