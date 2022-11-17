package UgurJava.j34_Iterators;

import java.util.*;

public class Task02 {
    /*  task->
       Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
       elementleri silip print eden code create ediniz
       (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
    Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
    output: [23,40]
        */
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) {
            int a = it1.next();
            if(a<20 || a>40){
                it1.remove();
            }
        }
        System.out.println(l1);
    }
}
