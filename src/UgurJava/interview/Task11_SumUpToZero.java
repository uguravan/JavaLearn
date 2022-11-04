package UgurJava.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Task11_SumUpToZero {
    /*
11   -->>  Write a function that, given an integer N (1 < N < 100),
returns an array containing N unique integers that sum up to 0,
The function can return any such array. Ex : given N = 4,
The function could return [1,0,-3,2] or [-2,1,-4,5].
The answer [1,-1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]
(but there are many more correct answers).
5
-2 -1 0 1 2
4
-2 -1 1 2
*/
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("1 ile 100 arası bir tamsayı giriniz: ");
        //int arrBoyut = scan.nextInt();
        System.out.println(Arrays.toString(zeroArray(scan.nextInt())));
    }
    public static int[] zeroArray(int a){
        int[] arr= new int[a];
        if(a%2==1){
            arr[a-1]=0;
            a-=1;
        }
        for(int i=0;i<a;i++){
            arr[i]=i+1;
            arr[i+1]=(i+1)*(-1);
            i++;
        }
        return arr;
    }
}
