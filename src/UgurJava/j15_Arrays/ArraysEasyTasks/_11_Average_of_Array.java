package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int numArr[]={12,14,21,23,10,4};
        double sum=0;
        for (int i=0; i<numArr.length; i++) {
            sum+=numArr[i];
        }
        System.out.println("ortalama= "+(sum/numArr.length));
    }
}