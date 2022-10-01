package UgurJava.j10_StringManipulations.StringManipulationTasks;

public class _11_String_methods08 {

    public static void main(String[] args) {

        /*  apple olan bir String oluşturun.
            String'in içinde app olup olmadığını doğrula.   */

        //Kodu aşağıya yazınız.

        String s = "apple";

        if (s.contains("app")) {
            System.out.println(s+"'in içinde app vardır. ");
        }else System.out.println(s+"'in içinde app yoktur. ");

    }
}
