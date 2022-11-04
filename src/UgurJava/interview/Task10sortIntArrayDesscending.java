package UgurJava.interview;

import java.util.Arrays;

public class Task10sortIntArrayDesscending {
    /*
10  -->>  Write a return method that can sort an int array in descending order
without using the sort method of the Arrays class
Ex : int [] arr = {10,20,7,8,90};
     arr = sort (arr); ==>  {90,20,10,8,7};
*/
    public static void main(String[] args) {
        int[] intArray = {10,20,7,8,90};
        System.out.println("array in descending order: "+ Arrays.toString(order(intArray)));
    }
    public static int[] order(int[] intArray) {
        int temp;
        for(int i=0; i<intArray.length-1; i++){
            for(int j=i+1; j<intArray.length; j++) {
                if (intArray[j]>intArray[i]){
                    temp=intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=temp;
                }
            }
        }
        return intArray;
    }
}
