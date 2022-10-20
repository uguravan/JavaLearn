package UgurJava.j18_Constructor;

public class C03_StudentRunner {


    public static void main(String[] args) {
        C03_Student ogr1 = new C03_Student();//öğrenci1 objesi create edildi
        ogr1.name = "Fatih";
        ogr1.surname = "ATAŞ";
        ogr1.sınıf=1;
        ogr1.okulNo=1001;
        ogr1.ort=77;
        ogr1.takdir=false;

        System.out.println(ogr1);
        ogr1.mezuniyet();

        C03_Student ogr2 = new C03_Student();//öğrenci1 objesi create edildi
        ogr2.name = "Koray";
        ogr2.surname = "Sevinç";
        ogr2.sınıf=11;
        ogr2.okulNo=1001;
        ogr2.ort=97;
        ogr2.takdir=true;
        System.out.println(ogr2);
    }
}
