package UgurJava.j15_Arrays.ArraysEasyTasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */
        int numArr[]={1,2,3,4};
        boolean flag=true;
        for (int i=0; i<numArr.length; i++){
            if (numArr[i] ==1){
                for (int j=0; j<numArr.length; j++){
                    if (numArr[j]==4) flag= false;
                }
            }
        }
        System.out.println(flag);
    }
}