package UgurJava.j15_Arrays;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{9,8},{34,0,4}};
        int max=0;

        for (int satır=0; satır<sayi.length; satır++){
            for (int sütun=0; sütun<sayi[satır].length; sütun++){
                if (sayi[satır][sütun]>max){
                    max=sayi[satır][sütun];
                }
            }
        }
        System.out.println(max);
    }
}