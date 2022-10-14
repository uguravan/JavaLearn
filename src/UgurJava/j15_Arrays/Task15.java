package UgurJava.j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{9,8}};
        int çarpım=1;

        for (int satır=0; satır<sayi.length; satır++){
            for (int sütun=0; sütun<sayi[satır].length; sütun++){
                çarpım*= sayi[satır][sütun];
            }
        }
        System.out.println(çarpım);
    }
}
