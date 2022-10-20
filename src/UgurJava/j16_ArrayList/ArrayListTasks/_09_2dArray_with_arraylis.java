package UgurJava.j16_ArrayList.ArrayListTasks;

import java.util.ArrayList;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */
    public static void main(String[] args) {
    int[][] numArr = {{1,2,3},{4,5,6},{7,8,9}};
    ArrayList<Integer> numbers = new ArrayList<>();
    for(int[] i : numArr){
        for(int j : i){
            numbers.add(j);
        }
    }
        System.out.println(numbers);
    }
}