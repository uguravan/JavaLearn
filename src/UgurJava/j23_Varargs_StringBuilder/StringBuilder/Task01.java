package UgurJava.j23_Varargs_StringBuilder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        String str = "I love Java";
        System.out.println(polindrome(str, tersString(str)));
    }

    public static String tersString(String str) {
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
        String ters= sb.reverse().toString();
        System.out.println(ters);
        return ters;
    }
    public static boolean polindrome(String s1, String s2) {
        boolean flag = s1.equalsIgnoreCase(s2)? true : false;
        return flag;
    }
}
