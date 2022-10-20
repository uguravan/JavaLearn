package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */
    static ArrayList<Integer> num= new ArrayList<Integer>(List.of(1,2,3,4,5));
    public static void main(String[] args) {
        System.out.println(getSum(num));

    }
    public static int getSum(ArrayList<Integer> num){
       int sum = 0;
       for (int i: num){
           sum += i;
       }
       return sum;
    }
}
