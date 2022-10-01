package UgurJava.j10_StringManipulations.StringManipulationTasks;

public class _14_String_methods11 {

    public static void main(String[] args) {

        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String s = "apple";

        if (s.equalsIgnoreCase("apple")) {
            System.out.println(s+" apple'a eşit");//apple apple'a eşit
        }else System.out.println(s+" apple'a eşit değil");
    }
}
