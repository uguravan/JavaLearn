package UgurJava.j18_Constructor;

public class C04_Teacher {
    String name;
    String surname;
    String branş;
    int tecrübe;
    int id;
    double maaş;
    boolean emekli;

    public  void  dersSaati(){
        System.out.println( " agam haftada 20 saatten sonra extraya girer :)");
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrübe=" + tecrübe +
                ", id=" + id +
                ", maaş=" + maaş +
                ", emekli=" + emekli +
                '}';
    }
}
