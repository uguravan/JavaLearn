package UgurJava.interview;

public class Task12_Permutation {
    /*
12 -->>  Given an array of 3 characters print all permutation
combinations from the given characters.
*/
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        permutation(arr);
    }
    public static void permutation(char[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                for(int k = 0; k < arr.length; k++){
                    if(i!=j&&j!=k&&i!=k) System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+" ");
                }System.out.println();
            }
        }
    }
}
