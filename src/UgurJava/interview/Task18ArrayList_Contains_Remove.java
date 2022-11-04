package UgurJava.interview;

import java.util.ArrayList;
import java.util.List;

public class Task18ArrayList_Contains_Remove {
    /*
18 -->> Given a list of people names: "Ahmed", "John", "Eric",
"Ahmed"...
Write a java operation to remove all the names named Ahmed
*/
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>(List.of("Ahmed", "John", "Eric", "Ahmed"));
        while(s1.contains("Ahmed")){s1.remove("Ahmed");}
        System.out.println(s1);
    }
}
