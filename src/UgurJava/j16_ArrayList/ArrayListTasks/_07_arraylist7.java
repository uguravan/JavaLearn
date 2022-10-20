package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */
    static ArrayList<Integer> num1 = new ArrayList<>(List.of(3,2,5,6));
    static ArrayList<Integer> num2 = new ArrayList<>(List.of(5,8,9));

    public static void main(String[] args) {
        System.out.println(common_values(num1, num2));
    }
    public static ArrayList<Integer> common_values(ArrayList<Integer> num1, ArrayList<Integer> num2){
        ArrayList<Integer> ortak = new ArrayList<>();
        for(int i : num2){
            for(int j : num1){
                if(j == i) ortak.add(i);
            }
        }
        return ortak;
    }
}
