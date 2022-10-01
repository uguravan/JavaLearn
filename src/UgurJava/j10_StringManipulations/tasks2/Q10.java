package UgurJava.j10_StringManipulations.tasks2;

public class Q10 {
    public static void main(String[] args) {
    /*    Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
                String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char h=harfDepo.charAt(harfDepo.indexOf("H"));
        char a=harfDepo.charAt(harfDepo.indexOf("A"));
        char l=harfDepo.charAt(harfDepo.indexOf("L"));
        char u=harfDepo.charAt(harfDepo.indexOf("U"));
        char k=harfDepo.charAt(harfDepo.indexOf("K"));

        System.out.println(h+a+l+u+k);//asciii->toplama-> 373
        System.out.println(""+h+a+l+u+k);//string->concat-> HALUK

        System.out.println(" "+pickName.charAt(pickName.indexOf("U"))+pickName.charAt(pickName.indexOf("G"))+pickName.charAt(pickName.indexOf("U"))+pickName.charAt(pickName.indexOf("R")));
    }
}
