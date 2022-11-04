package UgurJava.Denemeler;

public class C03_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder obj create etme...
        // 1. yol
        StringBuilder s1 = new StringBuilder("Java");// default capacity 16 bit olan value'su olmayan  bos sb
        String s2 = "Java";
        String s3 = "Java";
        StringBuilder s4 = s1;

        System.out.println((s2==s3)+" " + (s1==s4));//0 -> length(): sb 'deki karakter sayısı return eder
        System.out.println(""+s1+" "+s2+" "+s3+" "+s4);

    }
}
