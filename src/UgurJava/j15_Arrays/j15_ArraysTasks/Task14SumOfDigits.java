package UgurJava.j15_Arrays.j15_ArraysTasks;

public class Task14SumOfDigits {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        String arr[]= str.replaceAll("\\D","").split("");
        //int numArr[] = new int[arr.length];
        int sum=0;
        for (int i=0; i<arr.length; i++) {
            sum += Integer.valueOf(arr[i]);
        }
        System.out.println(sum);
    }
}

