package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _06_Array_contains {

    public static void main(String[] args) {
        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String fruits[]={"Apple", "Orange", "Banana", "Pineapple"};
        boolean apple=false;
        for (int i=0; i<fruits.length; i++){
            if (fruits[i].equalsIgnoreCase("Apple")) apple=true;
        }
        System.out.println(apple);
    }
}
