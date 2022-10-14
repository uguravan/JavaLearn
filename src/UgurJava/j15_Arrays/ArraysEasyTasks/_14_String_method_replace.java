package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String s= "Hello World";
        String str[]= s.split("");
        for (int i=0; i<str.length; i++) {
            if (str[i].equals("o")) str[i]="K";
            System.out.print(str[i]);
        }

    }
}