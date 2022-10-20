package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */
    static ArrayList<Integer> list = new ArrayList<>(List.of(5,4,6,2,1));
    public static void main(String[] args) {

        System.out.println(hillNum(list));
    }
    public static int hillNum(ArrayList<Integer> list) {
        int a=0;
        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i)<list.get(i-1) && list.get(i)>list.get(i+1)){
                a= list.get(i);
            }
        }
        return a;
    }
}
