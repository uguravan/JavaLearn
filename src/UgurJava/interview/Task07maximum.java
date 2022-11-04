package UgurJava.interview;

import java.util.Arrays;

public class Task07maximum {
    /*
7  -->>  Write a return method that can the maximum number from an int Array
*/
    public static void main(String[] args) {
        int[] intArray = {23,55,65,12,17,99};
        System.out.println("maximum number of array is: "+max(intArray));
    }
    public static int max(int[] intArray) {
       Arrays.sort(intArray);
       return intArray[intArray.length-1];
    }
}
