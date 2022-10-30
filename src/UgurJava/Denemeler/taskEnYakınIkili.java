package UgurJava.Denemeler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class taskEnYakınIkili {
    /*
    Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
    Örnek: (12, 31, 15, 32, 54) ==> Çıktı 31 ve 32'tür
    Listedeki 8 ve 12 dışındaki her öğenin değerini 2'şer artırınız.
    Örnek: (15, 31, 8, 13, 12) ==> Çıktı (17, 33, 8, 15, 12)
    public static void main(String[] args) {*/

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(List.of(12, 31, 15, 32, 54));
        ArrayList<Integer> num2 = new ArrayList<>(List.of(15, 31, 8, 13, 12));

        Collections.sort(num1);
        int fark=num1.get(num1.size()-1);
        int enyakınBuyuk=0;
        int enyakınKucuk=0;
        for (int i: num1){
            for (int j: num1){
                if(i>j){
                    if((i-j)<fark) {
                        fark=i-j;
                        enyakınBuyuk=i;
                        enyakınKucuk=j;
                    }
                }
            }
        }
        System.out.println("En yakın sayılar: "+enyakınKucuk+" "+enyakınBuyuk);

        for(int i=0 ; i<num2.size(); i++) {
            if(num2.get(i)!=8 && num2.get(i)!=12){
                num2.set(i, num2.get(i)+2);
            }
        }
        System.out.println(num2);
    }
}
