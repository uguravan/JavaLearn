package UgurJava.Denemeler;

import java.time.LocalTime;
import java.util.*;

public class socrat {
    public static void main(String[] args) {

        StringBuilder strB1 = new StringBuilder("AVATAR");

        strB1.subSequence(1,5);

        strB1.reverse();

        strB1.deleteCharAt(2);

        System.out.println(strB1);
    }
}