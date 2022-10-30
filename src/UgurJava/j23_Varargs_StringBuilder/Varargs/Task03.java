package UgurJava.j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    /*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */
    public static void main(String[] args) {
        int sayı=5;
        String str1="muharrem";
        String str2="ugur";
        String str3="ebikGabık";

        çarpString(sayı, str1, str2, str3);
    }
    public static void çarpString(int a, String... strs) {
        int enuzun=0;
        for(String str : strs) {
            if(str.length()>enuzun) enuzun=str.length();
        }
        System.out.println(a*enuzun);
    }
}
