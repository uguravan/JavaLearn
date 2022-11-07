package UgurJava.Denemeler;

public class taskIlkveSonHarf {
    public static void main(String[] args) {
        String str = "elma";
        int a= 2;
        System.out.println(ilksonHarf(str, a));
    }

    private static String ilksonHarf(String str, int a) {
        String yeni= (str.substring(0,1)+str.substring(str.length()-1)).repeat(a);
        System.out.println(yeni);
        return yeni;
    }
}
