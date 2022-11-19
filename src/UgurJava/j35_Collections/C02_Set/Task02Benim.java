package UgurJava.j35_Collections.C02_Set;

import java.util.*;

public class Task02Benim {
    public static void main(String[] args) {
        /*
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */
        String  arr[]={"Muharrem","Umit","Sinan","Nihan"};

        long hsBaşla = System.currentTimeMillis();
        HashSet<String> hs=new HashSet<>();
        hs.add("Muharrem");
        hs.add("Umit");
        hs.add("Sinan");
        long hsBitir = System.currentTimeMillis();
        System.out.println("hsFark : "+ (hsBitir - hsBaşla));

        long tsBaşla = System.currentTimeMillis();
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Muharrem");
        ts.add("Umit");
        ts.add("Sinan");
        long tsBitir = System.currentTimeMillis();
        System.out.println("tsFark : "+ (tsBitir - tsBaşla));

    }//main sonuu
}
