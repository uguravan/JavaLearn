package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String s= "Hello World";
        String str[]= s.split("");
        for (int i=str.length-1; i>=0; i--){
            System.out.print(str[i]);
        }
    }
}