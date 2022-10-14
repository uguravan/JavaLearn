package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int numArr[]= {14,19,5,21};
        int min=numArr[0];
        for (int i=0; i<numArr.length; i++){
            if(numArr[i]<min) min=numArr[i];
        }
        System.out.println(min);
    }
}

