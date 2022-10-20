package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */
    static ArrayList<Integer> num= new ArrayList<Integer>(List.of(1,5,22,10,20,14,8,25,30,28));
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println(rangeBtw(num,a,b));

    }
    public static int rangeBtw(ArrayList<Integer> num, int a, int b){
        int count=0;
        for(int i: num){
            if(i>=Math.min(a,b) && i<=Math.max(a,b)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
}