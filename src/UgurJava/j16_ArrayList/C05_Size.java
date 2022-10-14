package UgurJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Size {
    public static void main(String[] args) {
        // size();-> listin eleman saysısını return eder (arr->length)
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngelas","Londra","Stockholm"));
        System.out.println("listSehir.size() = " + listSehir.size());
    }
}
