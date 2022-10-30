package UgurJava.Denemeler;

public class youtube {
    /*
    Youtube video sayfasının urlsinde yer alan video id'sini
            return eden bir method yazınız :

    ÖRNEKLER
    youtubeId("https://www.youtube.com/watch?v=x8UAUAuKNcU")
    ID :  x8UAUAuKNcU
    youtubeId("https://www.youtube.com/watch?v=3Yh_6_zItPU")
    ID : 3Yh_6_zItPU
    youtubeId("https://www.youtube.com/watch?v=odnRRZKhNPk")
    ID : odnRRZKhNPk
    */
    public static void main(String[] args) {
        String s="https://www.youtube.com/watch?v=x8UAUAuKNcU";
        System.out.println("ID : " + youtubeId(s));
    }
/*    public static String youtubeId(String str) {
        return str.substring(str.lastIndexOf("=")+1);
    }
    public static String youtubeId(String str) {
       return str.substring(str.indexOf("=")+1);
    }*/
    public static String youtubeId(String str) {
        return str.substring(str.length()-11);
    }
}
