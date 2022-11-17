package UgurJava.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    //task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24,38,65,9,11));
        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) {
            it1.next();
        }

        while (it1.hasPrevious()) {
            if(it1.previous()%2==1){
                System.out.print(((int) Math.pow(it1.next(),2))+" ");
            }
            it1.previous();
        }

    }
}
