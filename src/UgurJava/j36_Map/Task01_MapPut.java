package UgurJava.j36_Map;

import java.util.HashMap;

public class Task01_MapPut {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
// task -> urun fiyatları toplamını hesaplayan code create ediniz..
        int sum=0;
        for(Integer v : map.values()) {
            sum += v;
        }
    }
}
