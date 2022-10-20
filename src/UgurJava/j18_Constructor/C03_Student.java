package UgurJava.j18_Constructor;

public class C03_Student {
    String name;
    String surname;
    int sınıf;
    int okulNo;
    double ort;
    boolean takdir;

    public void mezuniyet() {
        if (ort>=50){
            System.out.println("agam diploman hayırlı olsun. ");
        }else System.out.println("agam seneye de bekleriz :(");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sınıf=" + sınıf +
                ", okulNo=" + okulNo +
                ", ort=" + ort +
                ", takdir=" + takdir +
                '}';
    }
}
