package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */
    static ArrayList<String> cities = new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida", "Ohio"));
    public static void main(String[] args) {
        System.out.println(rotateList(cities));
    }
    public static ArrayList<String> rotateList(ArrayList<String> cities){
        ArrayList<String> newcities = new ArrayList<>();
        for(int i = cities.size()-1; i>=0 ; i--){
            newcities.add(cities.get(i));
        }
        return newcities;
    }
}

