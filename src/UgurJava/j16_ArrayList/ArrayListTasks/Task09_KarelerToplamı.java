package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09_KarelerToplamı {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20));
        ArrayList<Integer> sqrList = new ArrayList<>();
        int sqrSum=0;
        for (int i = 0; i < numList.size(); i++) {
            sqrList.add(numList.get(i)*numList.get(i));
            sqrSum += numList.get(i)*numList.get(i);
        }
        System.out.println("Tamkareler List: "+sqrList);
        System.out.println("Kareler Toplamı= "+sqrSum);
    }
}

