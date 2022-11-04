package UgurJava.interview;

import java.util.Arrays;

public class Task08minimum {
    /*
8  -->>  Write a return method that can minimum number from an int Array

*/
    public static void main(String[] args) {
        int[] intArray = {23,55,65,12,17,99};
        System.out.println("minimum number of array is: "+min(intArray));
    }
    public static int min(int[] intArray) {
        Arrays.sort(intArray);
        return intArray[0];
    }
}
