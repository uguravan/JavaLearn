package UgurJava.Denemeler;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<>();

        hSet.add("Z");

        hSet.add("Y");

        hSet.add("X");

        hSet.add("X");

        System.out.println(hSet);//A

        TreeSet<String> tSet = new TreeSet<>(hSet);

        System.out.println(tSet);//B

    }
}
