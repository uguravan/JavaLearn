package UgurJava.Homeworks.GarryHoca20_10;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    //Bir integer list olusturunuz ve bu list'deki tüm sayilarin karesinin toplamini bulunuz. Sonucu ekrana yazdiriniz.
    public static void main(String[] args) {
        ArrayList<Integer> numArr = new ArrayList<Integer>(List.of(1,2,3,4,5));
        int sum=0;
        for(int i : numArr){
            sum+= i*i;
        }
        System.out.println("Kareler toplamı= "+sum);
    }
}
