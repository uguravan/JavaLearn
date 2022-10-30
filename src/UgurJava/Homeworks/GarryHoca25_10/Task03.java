package UgurJava.Homeworks.GarryHoca25_10;

import java.util.Arrays;

public class Task03 {
/*
Soru 3) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini  birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i  ekrana  yazdiran bir program yaziniz.
{ {1,2,3}, {4,5}, {6,7} }
Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
     */
public static void main(String[] args) {
    int[][] multi= {{1,2,3}, {4,5}, {6,7}};
    int[] sumArr= new int[multi.length];

    int sum;
    for(int i=0; i<multi.length; i++) {
        sum=0;
        for(int j: multi[i]) {
            sum+=j;
        }
        sumArr[i]=sum;
    }
    System.out.println(Arrays.toString(sumArr));
}
}
