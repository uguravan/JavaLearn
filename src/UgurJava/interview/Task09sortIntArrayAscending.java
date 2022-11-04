package UgurJava.interview;

import java.util.Arrays;

public class Task09sortIntArrayAscending {
    /*
9  -->>  Write a return method that can sort an int array in Ascending
order without using the sort method of the Arrays class
Ex : int[] arr = {10,9,8,7};
     arr = Sort(arr); ==> {7,8,9,10};
*/
    public static void main(String[] args) {
        int[] intArray = {23,55,65,12,17,99};
        System.out.println("array in ascending order: "+Arrays.toString(order(intArray)));
    }
    public static int[] order(int[] intArray) {
        int temp;
        for(int i=0; i<intArray.length-1; i++){
            for(int j=i+1; j<intArray.length; j++) {
                if (intArray[j]<intArray[i]){
                    temp=intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=temp;
                }
            }
        }
        return intArray;
    }
}
