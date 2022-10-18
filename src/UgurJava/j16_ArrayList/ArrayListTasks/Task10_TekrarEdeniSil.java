package UgurJava.j16_ArrayList.ArrayListTasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task10_TekrarEdeniSil {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int[] numArray = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        Arrays.sort(numArray);
        ArrayList<Integer> numList1 = new ArrayList<>();
        ArrayList<Integer> numList2 = new ArrayList<>();

        for (int i = 0; i < numArray.length; i++){
            numList1.add(numArray[i]);
        }
        System.out.println(numList1);
        for (int i = 0; i < numList1.size();){
            numList2.add(numList1.get(i));
            numList1.removeAll(Collections.singleton(numList1.get(i)));
        }
        System.out.println(numList2);
    }
}
