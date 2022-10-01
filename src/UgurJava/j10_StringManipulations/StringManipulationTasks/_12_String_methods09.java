package UgurJava.j10_StringManipulations.StringManipulationTasks;

public class _12_String_methods09 {

    public static void main(String[] args) {

        /*  apple kelimesinden  oluşan bir String yaz.
            String'in içinde App olup olmadığını doğrula.  */

        //Kodu buraya yazınız.

        String s = "apple";

        if (s.contains("App")) {
            System.out.println(s+"'in içinde App vardır. ");
        }else System.out.println(s+"'in içinde App yoktur. ");

    }
}
