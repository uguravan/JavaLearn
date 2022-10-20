package UgurJava.j18_Constructor;

public class C04_TeacherRunner {


    public static void main(String[] args) {
        C04_Teacher ogrt1 = new C04_Teacher();//öğrenci1 objesi create edildi
        ogrt1.name="Haluk";
        ogrt1.surname="Bilgin";
        ogrt1.branş="Backend developer";
        ogrt1.tecrübe=11;
        ogrt1.maaş=50000;
        ogrt1.emekli=false;

        ogrt1.dersSaati();
        System.out.println(ogrt1);


    }
}
