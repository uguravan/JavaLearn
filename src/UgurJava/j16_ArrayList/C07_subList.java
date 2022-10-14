package UgurJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngelas","Londra","Stockholm"));
        // subList() -> listenen istenen list parcasını return eder..
        System.out.println("listSehir.subList(0,2) = " + listSehir.subList(0, 2));
        System.out.println("listSehir = " + listSehir);
    }
}
