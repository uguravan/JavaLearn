package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int numArr[]= {12,2,5,15,8};
        int max=numArr[0];
        for (int i=0; i<numArr.length; i++){
            if(numArr[i]>max) max=numArr[i];
        }
        System.out.println(max);
    }
}

