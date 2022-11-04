package UgurJava.interview;

public class Task04Revevrse {
    /*
 4 -->>  Write a return method that can reverse string
 Ex : Reverse("ABCD") ==> DCBA
 */
    public static void main(String[] args) {
        String s1 ="ABCD";
        System.out.println(reverse1(s1));
    }
    public static StringBuilder reverse1(String s1) {
        StringBuilder sb = new StringBuilder(s1);
        sb=sb.reverse();
        return sb;
    }
}
