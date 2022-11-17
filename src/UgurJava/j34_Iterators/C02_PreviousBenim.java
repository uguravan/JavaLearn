package UgurJava.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_PreviousBenim {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24,38,65,9,11,7,27,23));
        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) {
            it1.next();
        }
        while (it1.hasPrevious()) {
            System.out.print(it1.previous()+" ");
        }
        //System.out.println("l1 tersten print hali : "+l1);
        List<String> l2 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
        ListIterator<String> it2= l2.listIterator();
        while(it2.hasNext()){//b->s pointer sürekli sona doğru ilerler
            it2.next();
        }
        it2.previous();
        it2.set("Cebrail :-)");
        System.out.println(l2);
    }
}