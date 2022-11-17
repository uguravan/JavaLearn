package UgurJava.j35_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedListBenim {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mahmut");
        list.add("Neda");
        list.add("Neva");
        list.add("Murat");
        list.add(2,"Mustafa");
        list.addFirst("Javacan");
        list.add("JAVATAR");

        List<String> list2 = new LinkedList<>(Arrays.asList("Rambo", "İbo"));
        list.addAll(list2);

        System.out.println(list);

        LinkedList lolo = new LinkedList();
        lolo.add("JAVATAR");
        lolo.add(101);
        lolo.add(true);
        lolo.add('A');
        lolo.add(new LinkedList());

        System.out.println(lolo);

    }
}
