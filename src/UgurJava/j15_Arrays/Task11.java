package UgurJava.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    /*
 TASK :
 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

      String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
      */
    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String para[] = str.split(" ");
        Arrays.sort(para);
        int toplamdolar = 0;
        int toplampound = 0;

        for (int i = 0; i < para.length; i++) {
            if (para[i].contains("$")) {
                toplamdolar += Integer.parseInt(para[i] = para[i].substring(1));
            }else toplampound += Integer.parseInt(para[i] = para[i].substring(1));
        }
        System.out.println(toplamdolar + "$ " + toplampound+"£ ");
    }
}
/*
public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        System.out.println("paranın string hali :"+str);

        int toplamDolar = 0;
        int toplamSterlin = 0;

        String para[] = str.split(" ");
        System.out.println("para array : " + Arrays.toString(para));

        for (int i = 0; i < para.length; i++) {

            if (para[i].contains("$")) {
                toplamDolar += Integer.parseInt(para[i].replace("$", ""));
            }
            else {
                toplamSterlin += Integer.parseInt(para[i].replace("£", ""));
            }
        }
        System.out.println("toplam  $ miktarı :" + toplamDolar);
        System.out.println("toplam  £ miktarı :" + toplamSterlin);
    }
}*/