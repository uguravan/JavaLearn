package UgurJava.j34_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C01_IteratorsBenim {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(List.of("Fatih", "Cüneyt", "Koray", "Tekinay", "Selman"));
        List<String> l3 = new ArrayList<>(List.of("Fatih", "Cüneyt", "Koray", "Tekinay", "Selman"));
        List<String> l4 = new ArrayList<>(List.of("Fatih", "Cüneyt", "Koray", "Tekinay", "Selman"));
        Iterator<String> it1 = l1.iterator();
        ListIterator<String> it2 = l1.listIterator();

        while (it1.hasNext()) {
            System.out.print(it1.next()+" :-) ");
        }
        System.out.println();

        while (it2.hasNext()) {
            it2.set(it2.next()+" :-) ");
        }
        System.out.println(l1);

        String son []=l1.toArray(new String[0]);
        String joined = String.join("", son);
        System.out.println(joined);

        ListIterator<String> it3 = l3.listIterator();
        while (it3.hasNext()) {
            it3.set(it3.next().substring(0,0)+" :-)");
        }
        System.out.println(l3);

        ListIterator<String> it4 = l4.listIterator();
        while (it4.hasNext()) {
            it4.set(it4.next().substring(0,1).toUpperCase()+"***");
        }
        System.out.println(l4);

        String str4 []=l4.toArray(new String[0]);
        String joined4 = String.join(" ", str4);
        System.out.println(joined4);
    }
}
