package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _15_Word_Count {

    public static void main(String[] args) {
        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        String s= "Removes white space from both ends of a string";
        String str[]= s.split(" ");
        System.out.println(str.length);

    }
}