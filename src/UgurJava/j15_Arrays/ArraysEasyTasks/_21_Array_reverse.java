package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        int a=123;
        String num[]= Integer.toString(a).split("");
        for (int i=num.length-1; i>=0; i--){
            System.out.print(num[i]);
        }

    }
}


